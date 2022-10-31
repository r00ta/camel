/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.main.download;

import java.util.function.BiFunction;

import org.apache.camel.Route;
import org.apache.camel.model.CircuitBreakerDefinition;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.reifier.ProcessReifier;
import org.apache.camel.reifier.ProcessorReifier;

/**
 * When using circuit breakers then we need to download the runtime implementation
 */
public class CircuitBreakerDownloader {

    public static void registerDownloadReifiers() {
        ProcessorReifier.registerReifier(CircuitBreakerDefinition.class,
                new BiFunction<Route, ProcessorDefinition<?>, ProcessorReifier<? extends ProcessorDefinition<?>>>() {
                    @Override
                    public ProcessorReifier<? extends ProcessorDefinition<?>> apply(
                            Route route, ProcessorDefinition<?> processorDefinition) {
                        if (processorDefinition instanceof CircuitBreakerDefinition) {
                            CircuitBreakerDefinition cb = (CircuitBreakerDefinition) processorDefinition;
                            DependencyDownloader downloader = route.getCamelContext().hasService(DependencyDownloader.class);
                            if (downloader != null) {
                                String artifactId = null;
                                if (cb.getResilience4jConfiguration() != null) {
                                    downloader.downloadDependency("org.apache.camel", "camel-resilience4j",
                                            route.getCamelContext().getVersion());
                                }
                                if (cb.getFaultToleranceConfiguration() != null) {
                                    downloader.downloadDependency("org.apache.camel", "camel-microprofile-fault-tolerance",
                                            route.getCamelContext().getVersion());
                                }
                                if (cb.getConfiguration() != null) {
                                    String id = cb.getConfiguration();
                                    Object cfg = route.getCamelContext().adapt(ModelCamelContext.class)
                                            .getResilience4jConfiguration(id);
                                    if (cfg != null) {
                                        downloader.downloadDependency("org.apache.camel", "camel-resilience4j",
                                                route.getCamelContext().getVersion());
                                    }
                                    cfg = route.getCamelContext().adapt(ModelCamelContext.class)
                                            .getFaultToleranceConfiguration(id);
                                    if (cfg != null) {
                                        downloader.downloadDependency("org.apache.camel", "camel-microprofile-fault-tolerance",
                                                route.getCamelContext().getVersion());
                                    }
                                }
                            }
                        }
                        // use core reifier now we have downloaded JARs if needed
                        return ProcessReifier.coreReifier(route, processorDefinition);
                    }
                });
    }

}

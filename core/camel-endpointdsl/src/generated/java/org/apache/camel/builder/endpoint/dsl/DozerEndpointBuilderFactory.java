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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Map between Java beans using the Dozer mapping library.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DozerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Dozer component.
     */
    public interface DozerEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDozerEndpointBuilder advanced() {
            return (AdvancedDozerEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The name of a DozerBeanMapperConfiguration bean in the Camel registry
         * which should be used for configuring the Dozer mapping. This is an
         * alternative to the mappingFile option that can be used for
         * fine-grained control over how Dozer is configured. Remember to use a
         * # prefix in the value to indicate that the bean is in the Camel
         * registry (e.g. #myDozerConfig).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.converter.dozer.DozerBeanMapperConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mappingConfiguration the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder mappingConfiguration(
                Object mappingConfiguration) {
            doSetProperty("mappingConfiguration", mappingConfiguration);
            return this;
        }
        /**
         * The name of a DozerBeanMapperConfiguration bean in the Camel registry
         * which should be used for configuring the Dozer mapping. This is an
         * alternative to the mappingFile option that can be used for
         * fine-grained control over how Dozer is configured. Remember to use a
         * # prefix in the value to indicate that the bean is in the Camel
         * registry (e.g. #myDozerConfig).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.converter.dozer.DozerBeanMapperConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mappingConfiguration the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder mappingConfiguration(
                String mappingConfiguration) {
            doSetProperty("mappingConfiguration", mappingConfiguration);
            return this;
        }
        /**
         * The location of a Dozer configuration file. The file is loaded from
         * the classpath by default, but you can use file:, classpath:, or http:
         * to load the configuration from a specific location.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: dozerBeanMapping.xml
         * Group: producer
         * 
         * @param mappingFile the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder mappingFile(String mappingFile) {
            doSetProperty("mappingFile", mappingFile);
            return this;
        }
        /**
         * The id of a dataFormat defined within the Camel Context to use for
         * marshalling the mapping output to a non-Java type.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param marshalId the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder marshalId(String marshalId) {
            doSetProperty("marshalId", marshalId);
            return this;
        }
        /**
         * Fully-qualified class name for the source type used in the mapping.
         * If specified, the input to the mapping is converted to the specified
         * type before being mapped with Dozer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param sourceModel the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder sourceModel(String sourceModel) {
            doSetProperty("sourceModel", sourceModel);
            return this;
        }
        /**
         * Fully-qualified class name for the target type used in the mapping.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param targetModel the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder targetModel(String targetModel) {
            doSetProperty("targetModel", targetModel);
            return this;
        }
        /**
         * The id of a dataFormat defined within the Camel Context to use for
         * unmarshalling the mapping input from a non-Java type.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param unmarshalId the value to set
         * @return the dsl builder
         */
        default DozerEndpointBuilder unmarshalId(String unmarshalId) {
            doSetProperty("unmarshalId", unmarshalId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Dozer component.
     */
    public interface AdvancedDozerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DozerEndpointBuilder basic() {
            return (DozerEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedDozerEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedDozerEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface DozerBuilders {
        /**
         * Dozer (camel-dozer)
         * Map between Java beans using the Dozer mapping library.
         * 
         * Category: transformation
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-dozer
         * 
         * Syntax: <code>dozer:name</code>
         * 
         * Path parameter: name (required)
         * A human readable name of the mapping.
         * 
         * @param path name
         * @return the dsl builder
         */
        default DozerEndpointBuilder dozer(String path) {
            return DozerEndpointBuilderFactory.endpointBuilder("dozer", path);
        }
        /**
         * Dozer (camel-dozer)
         * Map between Java beans using the Dozer mapping library.
         * 
         * Category: transformation
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-dozer
         * 
         * Syntax: <code>dozer:name</code>
         * 
         * Path parameter: name (required)
         * A human readable name of the mapping.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default DozerEndpointBuilder dozer(String componentName, String path) {
            return DozerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DozerEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DozerEndpointBuilderImpl extends AbstractEndpointBuilder implements DozerEndpointBuilder, AdvancedDozerEndpointBuilder {
            public DozerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DozerEndpointBuilderImpl(path);
    }
}
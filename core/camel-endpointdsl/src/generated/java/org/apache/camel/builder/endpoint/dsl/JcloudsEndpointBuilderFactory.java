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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Interact with jclouds compute and blobstore service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JcloudsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JClouds component.
     */
    public interface JcloudsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJcloudsEndpointConsumerBuilder advanced() {
            return (AdvancedJcloudsEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The name of the blob container.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: blobstore
         * 
         * @param container the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointConsumerBuilder container(String container) {
            doSetProperty("container", container);
            return this;
        }
        /**
         * An optional directory name to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: blobstore
         * 
         * @param directory the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointConsumerBuilder directory(String directory) {
            doSetProperty("directory", directory);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JClouds component.
     */
    public interface AdvancedJcloudsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JcloudsEndpointConsumerBuilder basic() {
            return (JcloudsEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcloudsEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcloudsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJcloudsEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJcloudsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedJcloudsEndpointConsumerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedJcloudsEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JClouds component.
     */
    public interface JcloudsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJcloudsEndpointProducerBuilder advanced() {
            return (AdvancedJcloudsEndpointProducerBuilder) this;
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
        default JcloudsEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
        default JcloudsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The name of the blob.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: blobstore
         * 
         * @param blobName the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder blobName(String blobName) {
            doSetProperty("blobName", blobName);
            return this;
        }
        /**
         * The name of the blob container.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: blobstore
         * 
         * @param container the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder container(String container) {
            doSetProperty("container", container);
            return this;
        }
        /**
         * The group that will be assigned to the newly created node. Values
         * depend on the actual cloud provider.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param group the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder group(String group) {
            doSetProperty("group", group);
            return this;
        }
        /**
         * The hardware that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param hardwareId the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder hardwareId(String hardwareId) {
            doSetProperty("hardwareId", hardwareId);
            return this;
        }
        /**
         * The imageId that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param imageId the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder imageId(String imageId) {
            doSetProperty("imageId", imageId);
            return this;
        }
        /**
         * The location that will be used for creating a node. Values depend on
         * the actual cloud provider.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param locationId the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder locationId(String locationId) {
            doSetProperty("locationId", locationId);
            return this;
        }
        /**
         * The id of the node that will run the script or destroyed.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param nodeId the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder nodeId(String nodeId) {
            doSetProperty("nodeId", nodeId);
            return this;
        }
        /**
         * To filter by node status to only select running nodes etc.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param nodeState the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder nodeState(String nodeState) {
            doSetProperty("nodeState", nodeState);
            return this;
        }
        /**
         * Specifies the type of operation that will be performed to the
         * blobstore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The user on the target node that will run the script.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: compute
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointProducerBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JClouds component.
     */
    public interface AdvancedJcloudsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default JcloudsEndpointProducerBuilder basic() {
            return (JcloudsEndpointProducerBuilder) this;
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
        default AdvancedJcloudsEndpointProducerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedJcloudsEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JClouds component.
     */
    public interface JcloudsEndpointBuilder
            extends
                JcloudsEndpointConsumerBuilder,
                JcloudsEndpointProducerBuilder {
        default AdvancedJcloudsEndpointBuilder advanced() {
            return (AdvancedJcloudsEndpointBuilder) this;
        }
        /**
         * The name of the blob container.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: blobstore
         * 
         * @param container the value to set
         * @return the dsl builder
         */
        default JcloudsEndpointBuilder container(String container) {
            doSetProperty("container", container);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JClouds component.
     */
    public interface AdvancedJcloudsEndpointBuilder
            extends
                AdvancedJcloudsEndpointConsumerBuilder,
                AdvancedJcloudsEndpointProducerBuilder {
        default JcloudsEndpointBuilder basic() {
            return (JcloudsEndpointBuilder) this;
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
        default AdvancedJcloudsEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJcloudsEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface JcloudsBuilders {
        /**
         * JClouds (camel-jclouds)
         * Interact with jclouds compute and blobstore service.
         * 
         * Category: api,cloud,compute
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-jclouds
         * 
         * Syntax: <code>jclouds:command:providerId</code>
         * 
         * Path parameter: command (required)
         * What command to execute such as blobstore or compute.
         * There are 2 enums and the value can be one of: blobstore, compute
         * 
         * Path parameter: providerId (required)
         * The name of the cloud provider that provides the target service (e.g.
         * aws-s3 or aws_ec2).
         * 
         * @param path command:providerId
         * @return the dsl builder
         */
        default JcloudsEndpointBuilder jclouds(String path) {
            return JcloudsEndpointBuilderFactory.endpointBuilder("jclouds", path);
        }
        /**
         * JClouds (camel-jclouds)
         * Interact with jclouds compute and blobstore service.
         * 
         * Category: api,cloud,compute
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-jclouds
         * 
         * Syntax: <code>jclouds:command:providerId</code>
         * 
         * Path parameter: command (required)
         * What command to execute such as blobstore or compute.
         * There are 2 enums and the value can be one of: blobstore, compute
         * 
         * Path parameter: providerId (required)
         * The name of the cloud provider that provides the target service (e.g.
         * aws-s3 or aws_ec2).
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path command:providerId
         * @return the dsl builder
         */
        default JcloudsEndpointBuilder jclouds(String componentName, String path) {
            return JcloudsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static JcloudsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class JcloudsEndpointBuilderImpl extends AbstractEndpointBuilder implements JcloudsEndpointBuilder, AdvancedJcloudsEndpointBuilder {
            public JcloudsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JcloudsEndpointBuilderImpl(path);
    }
}
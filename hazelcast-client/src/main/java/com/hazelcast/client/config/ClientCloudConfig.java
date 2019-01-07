/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.client.config;

/**
 * hazelcast.cloud configuration to let the client connect the cluster via hazelcast.cloud
 */
public class ClientCloudConfig {

    private String discoveryToken;
    private boolean enabled;

    /**
     * hazelcast.cloud discoveryToken of your cluster
     *
     * @return discoveryToken
     */
    public String getDiscoveryToken() {
        return discoveryToken;
    }

    /**
     * @param discoveryToken hazelcast.cloud discoveryToken of your cluster
     * @return configured {@link com.hazelcast.client.config.ClientCloudConfig} for chaining
     */
    public ClientCloudConfig setDiscoveryToken(String discoveryToken) {
        this.discoveryToken = discoveryToken;
        return this;
    }

    /**
     * @return true if enabled, false otherwise
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled true to use hazelcast.cloud
     * @return configured {@link com.hazelcast.client.config.ClientCloudConfig} for chaining
     */
    public ClientCloudConfig setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
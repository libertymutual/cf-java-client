/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v3.serviceInstances;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.cloudfoundry.AllowNulls;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.Link;
import org.cloudfoundry.client.v3.Relationship;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

/**
 * The response payload for the Share Service Instance operation
 */
@JsonDeserialize
@Value.Immutable
abstract class _ShareServiceInstanceResponse {

    /**
     * The space
     */
    @JsonProperty("data")
    @Nullable
    abstract List<Relationship> getData();

    /**
     * The links
     */
    @AllowNulls
    @JsonProperty("links")
    @Nullable
    abstract Map<String, Link> getLinks();


}

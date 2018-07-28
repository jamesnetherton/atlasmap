/**
 * Copyright (C) 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atlasmap.spi.v3;

import io.atlasmap.api.v3.Message.Scope;
import io.atlasmap.api.v3.Message.Status;

/**
 *
 */
public interface MappingSupport {

    void autoSave();

    DataHandler handler(String id);

    Object value(String propertyName);

    BaseParameter parameterWithOutputName(String outputName);

    void setOutputProperty(String outputName, BaseParameter parameter);

    void clearExecutionMessages(Object context);

    void addMessage(Status status, Scope scope, Object context, String message, Object... arguments);
}
/*
 * Copyright 2021 Red Hat
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

package io.apicurio.registry.storage.impl.kafkasql.values;

import io.apicurio.registry.storage.impl.kafkasql.MessageType;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Value that carries no additional information.
 * Does not apply to a specific resource, but to the entire node.
 * The only content is the action being performed.
 *
 * @author Jakub Senko <jsenko@redhat.com>
 */
@RegisterForReflection
public class GlobalActionValue extends AbstractMessageValue {

    /**
     * Creator method.
     * @param action
     */
    public static GlobalActionValue create(ActionType action) {
        GlobalActionValue value = new GlobalActionValue();
        value.setAction(action);
        return value;
    }

    /**
     * @see MessageValue#getType()
     */
    @Override
    public MessageType getType() {
        return MessageType.GlobalAction;
    }
}

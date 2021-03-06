/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.schemaregistry.exceptions;

/**
 * Indicates an error while performing an operation on the underlying data store that
 * stores all schemas in the registry
 */
public class SchemaRegistryStoreException extends SchemaRegistryException {

  public SchemaRegistryStoreException(String message, Throwable cause) {
    super(message, cause);
  }

  public SchemaRegistryStoreException(String message) {
    super(message);
  }

  public SchemaRegistryStoreException(Throwable cause) {
    super(cause);
  }

  public SchemaRegistryStoreException() {
    super();
  }
}

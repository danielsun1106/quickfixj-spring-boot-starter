/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.allune.quickfixj.spring.boot.starter;

import io.allune.quickfixj.spring.boot.starter.autoconfigure.server.QuickFixJServerMarkerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Sets up an Acceptor (Server), configures the connection to accept connections from an Initiator (Client), handles the
 * connection's lifecycle and processes messages for all sessions
 *
 * @author Eduardo Sanchez-Ros
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(QuickFixJServerMarkerConfiguration.class)
public @interface EnableQuickFixJServer {
}

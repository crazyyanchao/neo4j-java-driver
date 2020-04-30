/*
 * Copyright (c) 2002-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
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
package org.neo4j.driver.internal.messaging.v4;

import org.junit.jupiter.api.Test;

import org.neo4j.driver.internal.messaging.MessageFormat;
import org.neo4j.driver.internal.messaging.v2.MessageReaderV2;
import org.neo4j.driver.internal.packstream.PackInput;
import org.neo4j.driver.internal.packstream.PackOutput;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.mockito.Mockito.mock;

class MessageFormatV4Test
{
    @Test
    void shouldCreateCorrectWriter()
    {
        MessageFormatV4 format = new MessageFormatV4();

        MessageFormat.Writer writer = format.newWriter( mock( PackOutput.class ) );

        assertThat( writer, instanceOf( MessageWriterV4.class ) );
    }

    @Test
    void shouldCreateCorrectReader()
    {
        MessageFormatV4 format = new MessageFormatV4();

        MessageFormat.Reader reader = format.newReader( mock( PackInput.class ) );

        assertThat( reader, instanceOf( MessageReaderV2.class ) );
    }
}

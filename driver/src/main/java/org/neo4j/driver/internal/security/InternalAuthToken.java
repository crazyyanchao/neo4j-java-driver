/*
 * Copyright (c) 2002-2018 Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.driver.internal.security;

import org.neo4j.driver.v1.AuthToken;
import org.neo4j.driver.v1.Value;

import java.util.Map;

/**
 * A simple common token for authentication schemes that easily convert to
 * an auth token map
 */
public class InternalAuthToken implements AuthToken
{
    private final Map<String,Value> content;

    public InternalAuthToken( Map<String,Value> content )
    {
        this.content = content;
    }

    public Map<String, Value> toMap()
    {
        return content;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        { return true; }
        if ( o == null || getClass() != o.getClass() )
        { return false; }

        InternalAuthToken that = (InternalAuthToken) o;

        return content != null ? content.equals( that.content ) : that.content == null;

    }

    @Override
    public int hashCode()
    {
        return content != null ? content.hashCode() : 0;
    }
}

/*
 * Copyright (c) 2002-2019 "Neo4j,"
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
package org.neo4j.driver.internal.cluster;

import java.util.Set;

import org.neo4j.driver.v1.net.ServerAddress;
import org.neo4j.driver.v1.net.ServerAddressResolver;

import static java.util.Collections.singleton;

public class IdentityResolver implements ServerAddressResolver
{
    public static final IdentityResolver IDENTITY_RESOLVER = new IdentityResolver();

    private IdentityResolver()
    {

    }

    @Override
    public Set<ServerAddress> resolve( ServerAddress initialRouter )
    {
        return singleton( initialRouter );
    }
}
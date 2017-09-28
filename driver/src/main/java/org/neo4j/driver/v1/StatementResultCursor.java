/*
 * Copyright (c) 2002-2017 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
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
package org.neo4j.driver.v1;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;

import org.neo4j.driver.v1.summary.ResultSummary;

public interface StatementResultCursor
{
    /**
     * Retrieve the keys of the records this result cursor contains.
     *
     * @return list of all keys.
     */
    List<String> keys();

    CompletionStage<ResultSummary> summaryAsync();

    CompletionStage<Record> nextAsync();

    CompletionStage<Record> peekAsync();

    CompletionStage<Record> singleAsync();

    CompletionStage<ResultSummary> forEachAsync( Consumer<Record> action );

    CompletionStage<List<Record>> listAsync();
}

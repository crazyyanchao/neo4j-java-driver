# ERROR:
```
Caused by: org.neo4j.driver.exceptions.ClientException: There is no procedure with the name `dbms.cluster.routing.getRoutingTable` registered for this database instance.

CALL dbms.routing.getRoutingTable({}, "neo4j")
╒═════╤══════════════════════════════════════════════════════════════════════╕
│"ttl"│"servers"                                                             │
╞═════╪══════════════════════════════════════════════════════════════════════╡
│300  │[{"addresses":["localhost:7687"],"role":"WRITE"},{"addresses":["localh│
│     │ost:7687"],"role":"READ"},{"addresses":["localhost:7687"],"role":"ROUT│
│     │E"}]                                                                  │
└─────┴──────────────────────────────────────────────────────────────────────┘

CALL dbms.cluster.routing.getRoutingTable({},"neo4j")
╒═════╤══════════════════════════════════════════════════════════════════════╕
│"ttl"│"servers"                                                             │
╞═════╪══════════════════════════════════════════════════════════════════════╡
│300  │[{"addresses":["localhost:7687"],"role":"WRITE"},{"addresses":["localh│
│     │ost:7687"],"role":"READ"},{"addresses":["localhost:7687"],"role":"ROUT│
│     │E"}]                                                                  │
└─────┴──────────────────────────────────────────────────────────────────────┘
```
```
CALL dbms.cluster.routing.getRoutingTable
CALL dbms.directories.data
CALL dbms.directories.import
CALL dbms.connectors.default_listen_address
CALL dbms.connector.bolt.tls_level
CALL dbms.windows_service_name
CALL dbms.database.state("db")
CALL test.driver.longRunningStatement
CALL test.driver.longStreamingResult
```
# YES:
```
CALL dbms.cluster.role()
CALL dbms.cluster.overview()
CALL dbms.listTransactions()
CALL dbms.components() YIELD edition
CALL dbms.listQueries() YIELD query RETURN query
```
# VERSION:
```
ongdb-version-3.5.17
neo4j-java-driver-4.1
```

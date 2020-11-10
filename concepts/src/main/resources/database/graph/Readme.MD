## Graph Database
### Example
Neo4J, DGraph
- Example
    
    The data are represented by Nodes 
    -- 
    #   | Node (Data)   | Edge (Relationship) | Edge (Relationship) |
    --- | ---   | --- | ---|
    1   | 82 | World Cup at Spain | Best decade year |
    
    ``cypher .: 
    MATCH (p:person)-[WORKS_AT]->(d:Dept) WHERE d.name = "Caneco" RETURN p.name
    ``
    

## Benefits
 - Don't need a table to support many to many relationship as relational database does. For instance, Students x Disciplines.
 In this case only find the edge and connect it to the node.
 - Better performance on a large dataset.
 - When your system has a lot of joins.
 - Graphs
 - Find financial fraud
 - Recommendation engines

## Drawback
 - 
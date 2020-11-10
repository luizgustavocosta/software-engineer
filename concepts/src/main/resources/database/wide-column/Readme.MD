## Wide column
### Example
Cassandra / Apache HBase
- Example
    
    Every key is unique and point to a collection of data
    
    -- 
    #   | Row key   | Columns |
    --- | ---   | --- |
    1   | Guga | name(Guga), age(37), lastName(Costa), eyes(brown) |
    2   | Tesla | name(Telsa), country(USA), foundation(2042) |
    
    ``CQL
    select from table order by (as SQL does)
    ``
    

## Benefits
 - time-series
 - historical records
 - high-write, low-read
 - schema-less

## Drawback
 - without join, since all data is stored in a flat way
 
## How it works?
Works using memory and for it has a limited memory but is really fast.
Doesn't have namespace, queries but is extremmely fast    
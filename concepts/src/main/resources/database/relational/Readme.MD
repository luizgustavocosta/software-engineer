## Document oriented Database
### Example
PostgreSQL / Oracle / DB2 / SQL Server
- Example
    
    Store the data using unique id aka PK and use the other tables using FK foreign key to build the model.
    SQL database are ACID compliant. Atomicity, Consistency, Isolation and Durability. 
    -- 
    #   | PK   | Table | FK |
    --- | ---   | --- | ---|
    1   | 10 | Squad| FK_born_country |
    
    ``sql .: 
    select * from Squad order by 1
    ``
    

## Benefits
 - Good for financial institutions due to the ACID property.  

## Drawback
 - Required a schema
 - Hard to scale, unless when CockroachDB is in the game.
 - Not ideal for unstructured data 
 
## How it works?
Works using memory and for it has a limited memory but is really fast.
Doesn't have namespace, queries but is extremmely fast    
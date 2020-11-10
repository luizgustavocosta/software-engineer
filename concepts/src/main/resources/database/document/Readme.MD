## Document oriented Database
### Example
MongoDB / Firestore/ DynamoDB
- Example
    
    Store documents and each document is a container of key and value pairs. The documents are stored in collections.
    Can be organized in a logic way and is denormalized.
    
    -- 
    #   | Collection   | SubCollection |
    --- | ---   | --- |
    1   | Doc1, DocN-1, DocN | DocN-1 -> DocN-2, DocN-3|
    
    ``json 
    select from table order by (as SQL does)
    ``
    

## Benefits
 - schema-less
 - fast to write/read
 - historical records
 - Games
 - IOT
 - Most app in cellphone

## Drawback
 - without join
 - Complex to update data
 - Disconnected data
 - Not a good option for Graph, Neo4J is :)
 
## How it works?
Works using memory and for it has a limited memory but is really fast.
Doesn't have namespace, queries but is extremmely fast    
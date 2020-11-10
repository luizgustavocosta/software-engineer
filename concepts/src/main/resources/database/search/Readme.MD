## Search Database
### Example
ElasticSearch/Solar/Lucene/Algolia (Cloud)/MeiliSearch
- Example
    
    The most of these type of DB are built over Lucene.
    This kind of DB works like a book index.
     
    #   | Documents   | Inverted index | |
    --- | ---   | --- | ---|
    #   | key | Terms | Documents |
    1   | text | Hi | 2,3 |
    1   | text | mon | 2,7,3 |
    2   | text | vai Corinthians | 2012 |
    
    ``cypher .: 
    MATCH (p:person)-[WORKS_AT]->(d:Dept) WHERE d.name = "Caneco" RETURN p.name
    ``
## Benefits
 - Search engines
 - Typeahead search box (prediciton) 

## Drawback
 - 
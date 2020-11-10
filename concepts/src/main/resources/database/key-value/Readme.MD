## Key and value
### Example
Redis/Main cache
- Example
    
    Every key is unique and point to a value
    
    -- 
    #   | Key   | Value |
    --- | ---   | --- |
    1   | user:spain:centre | I like soccer |
    
    ``
    redis> SET user:spain:centre "I like soccer" 
    ``
    
    ``
    redis> GET user:spain:centre "I like soccer"
    ``
    
    ``'I like soccer'``

## How it works?
Works using memory and for it has a limited memory but is really fast.
Doesn't have namespace, queries but is extremmely fast    
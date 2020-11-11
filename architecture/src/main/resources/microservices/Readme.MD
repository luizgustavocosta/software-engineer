## Microservices
### What is?
WIP

- Example
    
    Monolith changed to 4 microservices. A, B, C and D. Remember the microservices could be running in anywhere.
    For each there is a Service registry
    ``
    Service A -> Register on -> Service Register <- Lookup <- Service B then
    Service B -> connects to -> Service A 
    ``
    
    <b>That means</b>, but has a [price](##price) also for it
    
    ``
    Service A(Eureka client) -> Register on -> Service Register(Eureka Server) <- Lookup <- Service B(Eureka client) then
    Service B(Eureka client) -> connects to -> Service A(Eureka client) 
    ``
    
   <a name="price"></a> - Price
   - Add libraries to services
   - Healthcheck
   - Single Point of Failure (Server), Highly availability of Server
   
    
    Wit microservices is possible to reach the following [benefits](#benefits)
    
    But everything has a price, let's check it on the section [challenges](##challenges) 

##  <a name="benefits"></a>Benefits
 - Faster delivery - Smaller size encourages frequent releases with less risk
 - Problem isolation - Single microservice cannot crash the entire system
 - Scaling - Can scale individually
 - Culture - Well defined ownership
 - Flexibility - Polyglot services, own persistence such as DB

## <a name="challenges"></a>Challenges
 - Service discovery
 - Loud balance
 - Fault tolerance
 - Distributed tracing
 - Telemetrics
 - Security
 - Granularity
 - Bounded contexts
 - Data modeling
 - Independently release
 - Service contracts
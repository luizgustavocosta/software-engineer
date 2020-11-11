## Service Mesh
### What is?
Is a concept applied to Microservices
Motto -> Do not burden my code with all these infrastructure related decisions.
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
   
    With microservices is possible to reach the following [benefits](#benefits)
    
    But everything has a price, let's check it on the section [challenges](##challenges)
    
    Because of the text above the Service Mesh comes to isolate the communication, security etc from the services.
    Service mesh is able to do the following tasks: service communication, service discovery, routes between services, 
    observability, security, authentication, authorization, deploy, protocol to be used among the services Http1/2, gRPC and so on.
    
    Each service has a proxy sidecar to communicate with the service mesh.
    Zookeeper, Istio, and NGINX are examples of service mesh.  

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
 
### References
* https://www.nginx.com/blog/what-is-a-service-mesh/
* https://www.youtube.com/watch?v=QiXK0B9FhO0&list=PLhfHPmPYPPRlV_1JSSEtkEIuXEJQBkf1X  
Q8.What are the bean scopes available in Spring?
soln : In the Spring Framework, there are several bean scopes available to define the lifecycle and visibility of Spring beans. The choice of bean scope depends on the specific requirements of the application and how the beans should be managed. Here are the common bean scopes in Spring:

Singleton: This is the default scope in Spring. A singleton bean is created only once per Spring IoC container and shared across the entire application context. Whenever a singleton bean is requested, the same instance is returned. Singleton beans are suitable for stateless beans or beans that are thread-safe and do not maintain mutable state.

Prototype: A prototype bean is created each time it is requested from the Spring container. Each request for a prototype bean results in a new instance. Prototype beans are useful when you need a new instance every time, such as for stateful beans or beans that require a specific state for each instance.

Request: A request-scoped bean is created once per HTTP request in a web application. The same instance is used throughout the entire request processing, but a new instance is created for subsequent requests. Request-scoped beans are useful for components that need to maintain state or data specific to each HTTP request, such as web controllers or request-specific data access objects (DAOs).

Session: A session-scoped bean is created once per user session in a web application. The same instance is used throughout the user's session, but a new instance is created for each new session. Session-scoped beans are suitable for components that need to maintain state or data specific to each user session, such as user-specific preferences or shopping carts.

Application: An application-scoped bean is created once per web application (ServletContext). The same instance is shared across all sessions and requests within the application. Application-scoped beans are useful for global resources or components that need to be shared across the entire application, such as a cache manager or shared data source.

WebSocket: Introduced in Spring 4.1, WebSocket-scoped beans are created once per WebSocket connection. The same instance is used throughout the WebSocket session, but a new instance is created for each new WebSocket connection. WebSocket-scoped beans are suitable for components that need to maintain state or data specific to each WebSocket connection.

In addition to these standard scopes, Spring also provides custom scopes that can be defined based on specific application requirements.

It's important to choose the appropriate scope for beans based on their intended usage and the desired lifecycle and visibility. Careful consideration of bean scopes helps in managing resources effectively, optimizing performance, and ensuring the correct behavior of the application.
Q7.What are Spring Beans?
soln : In the Spring Framework, a Spring Bean is an object that is managed by the Spring IoC (Inversion of Control) container. It is an instance of a Java class that is configured and instantiated by the container, allowing for centralized management and dependency injection.

Here are the key points about Spring Beans:

Managed Objects: Spring Beans are objects that are managed by the Spring container. Instead of creating and managing the objects directly in the application code, the container takes responsibility for their creation, configuration, and lifecycle management.

Dependency Injection: Spring Beans participate in dependency injection, where the container injects the required dependencies into the beans at runtime. Dependencies can be injected through constructors, setter methods, or fields, based on the chosen injection approach (constructor injection, setter injection, or autowiring).

Configuration Metadata: Spring Beans are defined and configured using configuration metadata, such as XML files or Java-based configuration classes. The configuration metadata provides information to the container about the beans, their dependencies, and other settings required for their creation and management.

Bean Scopes: Spring Beans can have different scopes, defining the lifecycle and visibility of the beans. Common bean scopes include singleton (a single instance shared across the entire application), prototype (a new instance created each time the bean is requested), request (a new instance per HTTP request), session (a new instance per user session), and others.

Lifecycle Management: Spring Beans can have lifecycle callbacks, such as initialization and destruction methods. These methods are invoked by the container when the bean is being created or destroyed, allowing the bean to perform initialization tasks or release resources.

Annotation-based Configuration: Spring Beans can be configured using annotations, such as @Component, @Service, @Repository, or @Controller. These annotations help in identifying the classes as beans and automatically registering them with the Spring container.

Programmatic Configuration: In addition to annotation-based configuration, Spring Beans can be configured programmatically using Java configuration classes. These classes, annotated with @Configuration, define beans and their dependencies using methods annotated with @Bean.

Application Components: Spring Beans often represent application components, such as services, controllers, repositories, or data access objects (DAOs). These beans encapsulate the business logic and functionality of the application.

Centralized Management: The use of Spring Beans allows for centralized management of objects, promoting loose coupling and modular design. It separates the object creation and dependency management concerns from the application code, providing flexibility, reusability, and easier testing.

Spring Beans form the core building blocks of a Spring application. They are managed by the Spring container, configured using metadata, and participate in dependency injection. The Spring container takes care of their creation, wiring dependencies, and lifecycle management, enabling developers to focus on writing business logic rather than managing object creation and dependencies.
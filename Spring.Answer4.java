Q4.What do you mean by IoC Container?
soln : In the context of the Spring Framework, an IoC (Inversion of Control) container is a core component responsible for managing the creation, configuration, and lifecycle of objects in an application. It implements the principle of IoC, where the responsibility of object creation and dependency management is delegated to the container.

Here are the key points about the IoC container:

Object Creation and Management: The IoC container takes control of object creation, eliminating the need for explicit object instantiation using the new keyword. Instead, developers rely on the container to create and manage objects throughout the application.

Dependency Injection (DI): The IoC container handles the injection of dependencies into objects. It resolves the dependencies between objects based on their configuration and ensures that the required dependencies are provided to the objects at runtime. This promotes loose coupling and makes objects more reusable and testable.

Configuration Metadata: The IoC container uses configuration metadata, such as XML files or Java-based configuration classes, to define and manage objects and their dependencies. This metadata describes the beans, their relationships, and other properties required by the container.

Lifecycle Management: The IoC container manages the lifecycle of objects, ensuring that they are created, initialized, and destroyed properly. It invokes appropriate methods on the objects during their lifecycle, such as calling initialization methods after object creation and destruction methods before object disposal.

Container Scope: The IoC container typically has a broader scope than individual objects and is responsible for managing the lifecycle of multiple objects. It manages the configuration, creation, and destruction of objects across the application.

Object Collaboration: The IoC container facilitates collaboration between objects. It resolves the dependencies between objects and ensures that the necessary dependencies are injected, allowing objects to work together effectively.

Inversion of Control: The IoC container implements the principle of Inversion of Control, where the control of object creation and dependency management is inverted from the application code to the container. The container takes charge of managing objects, allowing developers to focus on the application logic.

Spring's IoC container, known as the Spring container or ApplicationContext, is one of the central components of the Spring Framework. It provides comprehensive support for dependency injection, object lifecycle management, configuration, and collaboration. The container allows for modular and reusable code, promotes loose coupling, and simplifies application development by taking care of object creation and management.
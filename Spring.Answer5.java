Q5.What do you understand by Dependency Injection?
soln : Dependency Injection (DI) is a design pattern and a fundamental concept in software development that allows objects to be loosely coupled by externalizing their dependencies. It is a form of Inversion of Control (IoC) where the responsibility of creating and managing dependencies is delegated to an external entity, often referred to as an IoC container or DI container.

In Dependency Injection:

Dependencies: A dependency is an object that is needed by another object to perform its functionality. It represents a service or collaborator that an object relies on to fulfill its responsibilities.

Inversion of Control: DI involves inverting the control of managing dependencies from within the object to an external entity, typically a DI container. Instead of an object creating or looking up its dependencies, the dependencies are injected into the object from the outside.

Dependency Provider: The DI container or a separate provider is responsible for creating and providing the necessary dependencies to the objects that require them. The container resolves dependencies and injects them into the objects at runtime, based on configuration or annotations.

Loose Coupling: DI promotes loose coupling between objects by removing explicit dependencies and object creation logic from the dependent objects. Instead, the dependencies are abstracted and injected, allowing objects to focus on their core functionality without being tightly coupled to specific implementations.

Configurability and Flexibility: DI allows for easy configuration and substitution of dependencies. Dependencies can be easily switched, replaced, or mocked during testing or when different implementations are required, without modifying the dependent object's code.

Testability: DI enhances testability as dependencies can be easily mocked or replaced with test doubles during unit testing. Test cases can inject specific dependencies to simulate different scenarios, making it easier to isolate and test individual components.

Types of Injection: There are different types of dependency injection:

Constructor Injection: Dependencies are injected via the constructor of the dependent object.
Setter Injection: Dependencies are injected through setter methods of the dependent object.
Field Injection: Dependencies are injected directly into fields of the dependent object.
Dependency Injection plays a vital role in achieving modular, reusable, and maintainable code. It decouples dependencies, improves code organization, promotes separation of concerns, and simplifies unit testing. By externalizing dependency management, DI enhances code flexibility, configurability, and scalability.
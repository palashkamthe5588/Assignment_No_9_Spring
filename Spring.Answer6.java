Q6.Explain the difference between constructor and setter injection?
soln : Constructor injection and setter injection are two different approaches to implementing Dependency     Injection (DI). They differ in how dependencies are provided to an object. Here are the key differences between constructor injection and setter injection:

Constructor Injection:

Principle: In constructor injection, dependencies are provided through the object's constructor.
Requirement: The dependent object must have a constructor that accepts the required dependencies as parameters.
Immutability: Constructor-injected dependencies are typically immutable, as they are provided at object creation and cannot be changed afterwards.
Mandatory Dependencies: Constructor injection implies that the dependencies are mandatory, meaning they must be provided at the time of object creation.
Guarantees: With constructor injection, dependencies are guaranteed to be available when the object is fully constructed. It helps ensure that the object is in a valid state from the beginning.
Simplicity: Constructor injection simplifies the creation of the dependent object by ensuring that all required dependencies are supplied at object creation time.
Setter Injection:

Principle: In setter injection, dependencies are provided through setter methods or property setters of the dependent object.
Flexibility: Setter injection allows for optional dependencies, as the dependencies can be set or changed after the object is constructed.
Dynamic Changes: Setter-injected dependencies can be modified or re-injected at runtime, allowing for dynamic changes to the object's dependencies.
Default or Optional Dependencies: Setter injection implies that the dependencies are not mandatory and can have default values or be left unset. The object can function with default values or null dependencies.
Granularity: Setter injection allows for finer-grained control over individual dependencies, as each dependency can be set independently.
Testability: Setter injection facilitates easier mocking and substitution of dependencies during unit testing, as the dependencies can be set to mock or test doubles as needed.
Choosing between constructor injection and setter injection depends on the specific requirements of the application and the object being injected. Constructor injection is generally preferred for mandatory dependencies and immutability, ensuring the object is fully initialized at creation. Setter injection provides more flexibility, especially for optional dependencies and dynamic changes to dependencies. Both approaches have their benefits and should be used based on the specific context and needs of the application.
Q9.What is Autowiring and name the different modes of it?
soln: Autowiring in Spring is a feature that automatically resolves dependencies between beans without the need for explicit configuration. It simplifies the process of injecting dependencies by allowing Spring to automatically wire beans together based on specified rules.

The different modes of autowiring in Spring are:

No Autowiring (default): This mode disables autowiring. Dependencies must be explicitly defined using XML configuration or annotations like @Autowired, @Resource, or @Inject. It provides the most control over dependency injection but requires manual configuration.

By Name: In this mode, Spring matches beans by their names. The names of the dependencies in the bean configuration should match the names of the beans to be injected. Autowiring by name can be achieved using the autowire="byName" attribute in XML configuration or @Autowired with @Qualifier annotations in Java configuration.

By Type: This mode autowires beans by their types. Spring matches the type of the dependency with the type of the bean to be injected. If there are multiple beans of the same type, an exception is thrown unless the dependency is marked as optional. Autowiring by type can be enabled using the autowire="byType" attribute in XML configuration or @Autowired annotation in Java configuration.

Constructor: This mode autowires dependencies through the constructor of a bean. The container looks for a constructor with matching arguments based on the types of the dependencies. If there is a single constructor, autowiring is performed automatically. Otherwise, the @Autowired annotation with @Qualifier can be used to specify the constructor to be used.

By Annotation: This mode autowires beans based on custom annotations. Developers can define their own annotations to mark fields, methods, or constructors for autowiring. Spring scans the components and looks for these custom annotations to perform autowiring.

Autodetection: In this mode, Spring automatically detects and autowires dependencies based on a combination of naming conventions, JavaBeans property names, and standard setter methods. The autodetection mode is deprecated in newer versions of Spring, and explicit autowiring through annotations or XML configuration is recommended instead.

The choice of autowiring mode depends on the specific requirements of the application and the desired level of control over dependency injection. It's important to carefully consider the mode and ensure proper configuration to avoid ambiguities or unexpected behavior in autowiring.
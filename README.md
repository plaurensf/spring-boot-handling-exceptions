# Handling Exceptions in Spring Boot

In this simple application, in which we have a single API to get product information, I learned how to handling exceptions in Spring boot.


Project structure:

```
── settings.gradle
── src
    ├── main    
    │   ├─── java
    │   │       └─── com
    │   │             └─── handlingexceptions
    │   │                    └─── controller
    │   │                           ├─── ExceptionHanlder.java
    │   │                           └─── ProductController.java
    │   │                    └─── entities
    │   │                           ├─── ProductException.java
    │   │                           └─── Product.java
    │   │                    ├─── service
    │   │                    │       ├─── impl
    │   │                    │       │     └─── ProductServiceImpl.java
    │   │                    │       ├─── ProductService.java
    │   │                    └─── HandlingExceptionsSpringBootApplication.java
    │   │
    │   └─── resources
    │           ├─── application.properties
    │           ├─── static
    │           └─── templates
    │           
```

In this project we learned that:

1. Spring provides @ControllerAdvice annotation for handling exception in Spring Boot, it tells that this class will act like an interceptor in case of exceptions.
2. We can have multiple exception handlers to handle each exception

# Quality Hub is designed to illustrate architecture level unit test design for web Service used Domain-Driven-Development 

## What is Domain-Driven-Development (DDD)?

Domain-Driven-Development (DDD) is a software development approach that emphasizes the importance of the domain, or the specific area of knowledge and activity that the software is intended to address. DDD focuses on creating a shared understanding of the domain between developers and domain experts, and using that understanding to guide the design and implementation of software systems.

## Layers of DDD
DDD typically involves several layers, including:
- **Domain Layer**: It is responsible for modeling the domain and encapsulating the behavior of domain entities.
- **Application Layer**: This layer is responsible for coordinating the interactions between the domain layer and presemtation layer. It handles use cases and application-specific logic.
- **Infrastructure Layer**: This layer provides technical capabilities such as data persistence, messaging, and external contentService integration.
- **Presentation Layer**: This layer is responsible for handling user interactions and presenting information to users.
- **Testing Layer**: This layer includes unit tests, integration tests, and other types of tests to ensure the quality and reliability of the software.

## How to run with maven wrapper

``./mvnw spring-boot:run``

## Why do we assert (Architectural) Constraints? 
Architecture level unit test design is important for several reasons:
1. **Ensures Correctness**: Unit tests help ensure that individual components of the architecture are functioning correctly and as intended.
2. **Facilitates Refactoring**: With a comprehensive suite of unit tests, developers can refactor code with confidence, knowing that any changes made will not break existing functionality.
3. **Improves Maintainability**: Well-designed unit tests make it easier to maintain and update the architecture over time, as they provide a safety net for catching regressions and bugs.

## What is ArchUnit?
ArchUnit is a free, simple and extensible library for checking the architecture of your Java code. 
That is, ArchUnit can check dependencies between packages and classes, layers and slices, check for cyclic dependencies and more. 
It does so by analyzing given Java bytecode, importing all classes into a Java code structure. 
ArchUnit’s main focus is to automatically test architecture and coding rules, using any plain Java unit testing framework.


## References 
1. ArchUnit documentation: https://www.archunit.org/userguide/html/000_Index.html
2. Domain-Driven Design: https://martinfowler.com/bliki/DomainDrivenDesign.html
3. Spring boot crash course: https://youtu.be/UgX5lgv4uVM?si=wFcRo9mfuF8HrOH2
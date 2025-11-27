# Quality Hub is designed to illustrate architecture level unit test design for web contentService used Domain-Driven-Development 

## What is Domain-Driven-Development (DDD)?

Domain-Driven-Development (DDD) is a software development approach that emphasizes the importance of the domain, or the specific area of knowledge and activity that the software is intended to address. DDD focuses on creating a shared understanding of the domain between developers and domain experts, and using that understanding to guide the design and implementation of software systems.

## layers of DDD
DDD typically involves several layers, including:
- **Domain Layer**: It is responsible for modeling the domain and encapsulating the behavior of domain entities.
- **Application Layer**: This layer is responsible for coordinating the interactions between the domain layer and other layers of the application. It handles use cases and application-specific logic.
- **Infrastructure Layer**: This layer provides technical capabilities such as data persistence, messaging, and external contentService integration.
- **Presentation Layer**: This layer is responsible for handling user interactions and presenting information to users.
- **Testing Layer**: This layer includes unit tests, integration tests, and other types of tests to ensure the quality and reliability of the software.

## how to run with maven wrapper

``./mvnw spring-boot:run``
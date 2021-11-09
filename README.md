# hexagonal-architecture-presentation
Project of demonstration of hexagonal architecture.

Branches content:
- **main**: 'classic' spring boot mvc project
- **hexa**: refactored spring boot project following Hexagonal architecture
- **hexa-quarkus**: same project, same domain module, but with Quarkus framework

## Usage
Java 17 needed
`./mvnw spring-boot:run -f web/pom.xml`

## Warning
This project was made to demonstrate a refactoring following hexa archi, 
it was made for a quick demo, some pom.xml may be broken
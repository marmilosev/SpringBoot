Accessing Data with JPA (Java Persistence API)
Building an application that uses Spring Data JPA to store and retrieve data in a relational database.
Application that stores Student POJOs(Plain Old Java Objects) in a memory-based database.

Steps to reproduce it:
    1. In Spring Initializr (https://start.spring.io/) choose prefered options and for dependencies add Spring Web, Spring Data JPA and H2 Database and generate zip file. 
    2. Open it with prefered IDE.
    3. Create new class Student and annotate it with @Entity which indicates that it is a JPA entity.
        In this class Student has three attributes and two constructors. 
        Attribute id is annotated with @Id which indicated that this is the object's id and @GeneratedValue to indicate that id should be generated automatically.
        We also hvae method toString() which print outs the students' properties and we generated getters.
    4. Create interface named StudentRepository.
        This repository extends CrudRepository. CrudRepository is a Spring Data interface for generic CRUD operations on a repository of a specific type. It provides several methods out of the box for interacting with a database.
        Define methods.
    5. Open the class that Spring Initializr created with the project, in my case it is called DemoApplication.
        In this class logger is created to get output and we set up some data to generate output.
        Logger should be imported from org.slf4j which stands for Simple Logging Façade for Java. It allows users to work with any of the logging frameworks with a single dependency. Spring Boot comes with SLF4J inbuilt, which is an abstraction of all these logging frameworks. 
        In this class we created demo method which put StudentRepository through a few tests.
        The demo() method returns a CommandLineRunner bean that automatically runs the code when the application launches.
    6. Run the app and in output you will se the results or execute the project via CommandPrompt or Terminal using command ./mvnw spring-boot:run (for using Maven) or ./gradlew bootRun (for using Gradle).
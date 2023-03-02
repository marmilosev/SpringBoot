Serving Web Content with Spring MVC - Creating a “Hello, World” web site with Spring.

1. With Spring Initializr create project. Dependencies needed are Spring Web, Spring Boot DevTools and Thymeleaf.
2. Open the project in IDE.
3. Create class GreetingController with @Controller annotation. Controller handles HTTP requests, for example @GetMapping annotate handling of GET requests.
@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. This query string parameter is not required. If it is absent in the request, the defaultValue of World is used. The value of the name parameter is added to a Model object, ultimately making it accessible to the view template.
4. Next thing is to create html file (path: src/main/resources/templates/greeting.html). In that html file first thign is implementation of thymeleaf.
Thymeleaf parses the greeting.html template and evaluates the th:text expression to render the value of the ${name} parameter that was set in the controller.
5. Execute file which contains main method (the one that was created with the project and not modified).
6. Enter in browser http://localhost:8080/greeting (to get the default name value) or http://localhost:8080/greeting?name=YOUR_NAME (to get Hello, with desired name).

<h1 align="center"> Restaurant Model</h1>

>### Framework Used
* [SpringBoot](javatpoint.com/spring-boot-tutorial)

>### Language Used
* [Java](https://www.java.com/en/download/help/whatis_java.html)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic.
* **Repository** - This layer maintains the databases thing on which CRUD operations are performed
* **Model** - This layer consists basically various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project

>Step 1: Create a Spring Boot Project

* Use the Spring Initializer tool to create a new Spring Boot project.
* Select Maven as the project type.
* Choose the desired Java version and packaging type.
* Add the "Spring Web"
  and "Lombok" dependency to the project.
* Click on the "Generate" or "Generate and download" button to download the project files.

>Step 2: Create the RestaurantController Class

* Create a new Java class called RestaurantController in the controller package of your Spring Boot project.
* Annotate the class with @RestController and @RequestMapping.Mention the endpoint
* Autowired an instance of the RestaurantService class, which will be used to handle the business logic.
* Add the different mappings @GetMapping, @PostMapping, @PutMapping and @DeleteMapping

>Step 3: Create the RestaurantService Class
* Create a new Java class called RestaurantService in the service package of your Spring Boot project.
* Annotate the class with @Service to indicate that it's a service class.
* Implement all the business logic
>Step 4: Create the RestaurantRepository class
* Create a new Package Repository which implements all the databases functions.
* We have used ArrayList to store our Restaurant database

>Step 5 : Create a model class
* This will contain all the attributes which a restaurant should contain.

>## Project Summary
The above project implements a Restaurant model which add some class variables to Restaurant  model class ( like restaurant name, restaurant address, number, specialty, total staffs etc.) on which various operation to be performed :-
* get Restaurant by id using GetMapping.
* get all Restaurant using  GetMapping
* Add some Restaurant to Restaurant lists using PostMapping
* update Restaurant information like Specialty.
* delete Restaurant from the list.

>## Installation and Usage
Run code using an ide and check working on postman
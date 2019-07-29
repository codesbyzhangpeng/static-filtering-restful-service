# static-filtering-restful-service
Development process:

1. Generate a spring boot start project with web dependency

2. Create one bean Employee with a few fields (firstName, lastName, age, email), Constructors, setters and getters

3. Create one Controllercontroller and annoate the class with @RestController

4. Create one methods and annotate the method with @GetMapping

5. Add Annotations @JsonIgnore to the fields of the bean

6. Add Annotation @JsonIgnoreProperties to the bean class: @JsonIgnoreProperties(value= {"age", "firstName"})

7. Run the project and check the result with postman

# SubscriptionManager

The SubscriptionManager is a project that features the use of the REST API to GET, PUT and DELETE the subscriptions of a customer. The API is tested in the Service class by using the Customer object class which is acting as a client library. By providing a unique id for the Customer object the developer has the option to add, read or remove subscriptions from the customer by using their respective object methods.

These methods are used on endponts ending on 
"subscriptions/id" 
where the "id" refers to the unique id of the customer.

http://localhost:8080 has been used to test the API. The Controller class handles the REST calls. The Subscription object class provides a way to recieve and send the subcription data as an object.

# How to run
The project is built with maven. To run the project in IntelliJ IDEA, go to
edit configurations
add new configuration -> select Maven
set Working directory to the path where the pom.xml file is located
set Command line to spring-boot:run
apply and run the maven configuration

This project is made in Java 1.8 and using Spring Boot

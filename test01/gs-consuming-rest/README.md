KieaGradle/test01/gs-consuming-rest
================================================

RESTful gradle project

Build an executable JAR
-----------------------
You can run the application from the command line with Gradle or Maven.
Or you can build a single executable JAR file that contains all the necessary dependencies,
classes, and resources, and run that.
This makes it easy to ship, version, and deploy the service as an application throughout
the development lifecycle, access different environments, and so forth.
  
If you are using Gradle, you can run the application using ./gradlew bootRun.
Or you can build the JAR file using ./gradlew build.
Then you can run the JAR file: java -jar build/libs/gs-consuming-rest-0.1.0.jar
  
If you are using Maven, you can run the application using ./mvnw spring-boot:run.
Or you can build the JAR file with ./mvnw clean package. 
Then you can run the JAR file: java -jar target/gs-consuming-rest-0.1.0.jar

```
$ ./neo4j start
$ ./neo4j stop

$ curl http://localhost:8080

$ curl http://localhost:8080/people

$ curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" }' http://localhost:8080/people

$ curl -i http://localhost:8080/people

$ curl -i http://localhost:8080/people/1

$ curl -i http://localhost:8080/people/search

$ curl -i http://localhost:8080/people/search/findByLastName?name=Baggins


```


References
----------
- [Consuming a RESTful Web Service](https://spring.io/guides/gs/consuming-rest/ "Consuming a RESTful Web Service"):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):

.....




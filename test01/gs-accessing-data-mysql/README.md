KieaGradle/test01/gs-rest-service
=================================

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
Then you can run the JAR file: java -jar build/libs/gs-accessing-data-mysql-0.1.0.jar
  
If you are using Maven, you can run the application using ./mvnw spring-boot:run.
Or you can build the JAR file with ./mvnw clean package. 
Then you can run the JAR file: java -jar target/gs-accessing-data-mysql-0.1.0.jar

```
http://localhost:8080/demo/add?name=Hello&email=name@email.com
	Saved

http://localhost:8080/demo/all
	[{"id":1,"name":"Hello","email":"name@email.com"}]
```


References
----------
- [spring-guides/gs-rest-service](https://github.com/spring-guides/gs-rest-service "spring-guides/gs-rest-service"):
- []( ""):
- []( ""):
- []( ""):
- []( ""):

.....




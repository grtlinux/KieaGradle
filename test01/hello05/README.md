KieaGradle/test01/hello05
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
Then you can run the JAR file: java -jar build/libs/hello05-0.1.0.jar
  
If you are using Maven, you can run the application using ./mvnw spring-boot:run.
Or you can build the JAR file with ./mvnw clean package. 
Then you can run the JAR file: java -jar target/hello05-0.1.0.jar

```
http://localhost:8080/

	GET Users     GET      /api/v1/users       select all
	POST User     POST     /api/v1/users       insert
	GET User      GET      /api/v1/users/{id}  select an item
	PUT User      PUT      /api/v1/users/{id}  update
	DELETE User   DELETE   /api/v1/users/{id}  delete

* GET   http://localhsot:8080/dummy_url       error
->
{
    "timestamp": "2018-11-21T11:20:00.296+0000",
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/kang"
}

* POST  http://localhost:8080/api/v1/users    insert
{
	"firstName": "Ramesh",
	"lastName": "fadatare",
	"emailId": "ramesh@gmail.com",
	"createdBy": "Ramesh",
	"updatedBy": "Ramesh"
}

* POST  http://localhost:8080/api/v1/users    insert
{
	"firstName": "Kiea",
	"lastName": "Kang",
	"emailId": "kang@gmail.com",
	"createdBy": "Kang",
	"updatedBy": "Kang"
}

* POST  http://localhost:8080/api/v1/users    insert
{
	"firstName": "Seok",
	"lastName": "Kang",
	"emailId": "seok@gmail.com",
	"createdBy": "Kang",
	"updatedBy": "Kang"
}

* POST  http://localhost:8080/api/v1/users    insert
{
	"firstName": "Ram",
	"lastName": "Jadhav",
	"emailId": "ramesh123@gmail.com",
	"createdBy": "Ramesh",
	"updatedBy": "Ramesh"
}

* POST  http://localhost:8080/api/v1/users    insert
{
	"firstName": "Soo",
	"lastName": "Hong",
	"emailId": "soo@gmail.com",
	"createdBy": "Hong",
	"updatedBy": "Hong"
}

* GET http://localhost:8080/api/v1/users      select all

* GET http://localhost:8080/api/v1/users/2    select an item

* PUT http://localhost:8080/api/v1/users/2    update
{
	"firstName": "Kiea",
	"lastName": "Kang",
	"emailId": "grtlinux@gmail.com",
	"createdBy": "Kang",
	"updatedBy": "Kang"
}

* DELETE http://localhost:8080/api/v1/users/5  delete


```


References
----------
- [RameshMF/springboot2-jpa-crud-rest](https://github.com/RameshMF/springboot2-jpa-crud-rest):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):

.....




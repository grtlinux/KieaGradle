# KieaGradle
Gradle projects

Wrapper
------
```
	--------------------- Gradle --------------------
	$ gradle wrapper                         <--- very important
	$ tree /f gradle
		....../gradle
		└─wrapper
		        gradle-wrapper.jar
		        gradle-wrapper.properties
		        	
	
	$ ./gradlew clean build
	$ java -jar build/libs/XXXXX.jar
	
	--------------------- Maven --------------------
	$ mvn -N io.takari:maven:wrapper         <--- very important
	$ tree /f .mvn
		....../.mvn
		└─wrapper
		        maven-wrapper.jar
		        maven-wrapper.properties
		        MavenWrapperDownloader.java

	$ ./mvnw clean package
	$ java -jar target/XXXXX.jar
	
```


References
----------
- [SPRING INITIALIZR](https://start.spring.io/ "SPRING INITIALIZR")
-
- [Home](https://blog.perfectacle.com/ "Home")
- [Spring Boot Tutorial-Spring Boot+ Gradle](https://www.javainuse.com/spring/SpringBoot_HelloWorld_gradle "Spring Boot Tutorial-Spring Boot+ Gradle")
- [Spring + Gradle 연동하기](http://aristatait.tistory.com/66 "Spring + Gradle 연동하기")
- [#3_[spring boot] 프로젝트 처음 시작하기(jsp vieeResolver)](http://lee-mandu.tistory.com/343?category=715433 "#3_[spring boot] 프로젝트 처음 시작하기(jsp vieeResolver)")
- [Gradle 멀티 프로젝트 관리](https://jojoldu.tistory.com/123 "Gradle 멀티 프로젝트 관리")
-
- [Spring boot 기반 REST API 제작 (1)](https://medium.com/@devAsterisk/spring-boot-%EA%B8%B0%EB%B0%98-rest-api-%EC%A0%9C%EC%9E%91-1-ecfdf9d4d41e "Spring boot 기반 REST API 제작 (1)")
- [Spring boot 기반 REST API 제작 (2)](https://medium.com/@devAsterisk/spring-boot-%EA%B8%B0%EB%B0%98-rest-api-%EC%A0%9C%EC%9E%91-2-79c484fcadbe "Spring boot 기반 REST API 제작 (2)")
- [Spring boot 기반 REST API 제작 (3)](https://medium.com/@devAsterisk/spring-boot-%EA%B8%B0%EB%B0%98-rest-api-%EC%A0%9C%EC%9E%91-3-b16055f5dc6e "Spring boot 기반 REST API 제작 (3)")
- [Spring boot 기반 REST API 제작 (4)](https://medium.com/@devAsterisk/spring-boot-%EA%B8%B0%EB%B0%98-rest-api-%EC%A0%9C%EC%9E%91-4-503f3a9befba "Spring boot 기반 REST API 제작 (4)")
- [Spring boot 기반 REST API 제작 (5)](https://medium.com/@devAsterisk/spring-boot-%EA%B8%B0%EB%B0%98-rest-api-%EC%A0%9C%EC%9E%91-5-bd1b4f0e4680 "Spring boot 기반 REST API 제작 (5)")
-
- [Spring Boot, MySQL, JPA, Hibernate Restful CRUD API Tutorial](https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/ "Spring Boot, MySQL, JPA, Hibernate Restful CRUD API Tutorial"): [https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial](https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial)
- [Spring Boot 2 Hibernate 5 MySQL CRUD REST API Tutorial](http://www.javaguides.net/2018/09/spring-boot-2-hibernate-5-mysql-crud-rest-api-tutorial.html "Spring Boot 2 Hibernate 5 MySQL CRUD REST API Tutorial"): [RameshMF/springboot2-jpa-crud-rest](https://github.com/RameshMF/springboot2-jpa-crud-rest)
- [Creating a CRUD REST API/Service with Spring Boot, JPA and Hibernate](http://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate "Creating a CRUD REST API/Service with Spring Boot, JPA and Hibernate")
-
- [Create a Gradle Java Web Application and run on Gradle Tomcat Plugin](https://o7planning.org/en/11247/create-a-gradle-java-web-application-and-run-on-gradle-tomcat-plugin#a4930483 "")
- *[Spring Tutorial](https://www.journaldev.com/8398/spring-mvc-gradle "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
- []( "")
.....


See Also
--------

The following guides may also be helpful:

* https://spring.io/guides/gs/rest-service/[Building a RESTful Web Service]
* https://spring.io/guides/gs/rest-hateoas/[Building a Hypermedia-Driven RESTful Web Service]
* https://spring.io/guides/gs/testing-restdocs/[Creating API Documentation with Restdocs]
* https://spring.io/guides/gs/accessing-gemfire-data-rest/[Accessing GemFire Data with REST]
* https://spring.io/guides/gs/accessing-mongodb-data-rest/[Accessing MongoDB Data with REST]
* https://spring.io/guides/gs/accessing-data-mysql/[Accessing data with MySQL]
* https://spring.io/guides/gs/accessing-data-rest/[Accessing JPA Data with REST]
* https://spring.io/guides/gs/accessing-neo4j-data-rest/[Accessing Neo4j Data with REST]
* https://spring.io/guides/gs/consuming-rest/[Consuming a RESTful Web Service]
* https://spring.io/guides/gs/consuming-rest-angularjs/[Consuming a RESTful Web Service with AngularJS]
* https://spring.io/guides/gs/consuming-rest-jquery/[Consuming a RESTful Web Service with jQuery]
* https://spring.io/guides/gs/consuming-rest-restjs/[Consuming a RESTful Web Service with rest.js]
* https://spring.io/guides/gs/securing-web/[Securing a Web Application]
* https://spring.io/guides/tutorials/bookmarks/[Building REST services with Spring]
* https://spring.io/guides/tutorials/react-and-spring-data-rest/[React.js and Spring Data REST]
* https://spring.io/guides/gs/spring-boot/[Building an Application with Spring Boot]

.....





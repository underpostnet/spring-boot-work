### Dependencies


- **spring-boot-starter-web** : It is used for building web layer, including REST APIs, applications using Spring MVC. Uses Tomcat as the default embedded container.


- **spring-boot-starter-data-jpa** : It includes spring data, hibernate, HikariCP, JPA API, JPA Implementation (default is hibernate), JDBC and other required libraries.


- **h2** : Though we can add any database easily using datasource properties in application.properties file, we are using h2 database in reduce unnecessacery complexity.


- **spring-boot-starter-test** : It is used to test Spring Boot applications with libraries including JUnit, Hamcrest and Mockito.


- **spring-boot-starter-thymeleaf** : A Java template engine for processing and creating HTML, XML, JavaScript, CSS and text.

- **JUnit4** : A test framework which uses annotations to identify methods that specify a test.


### Usage


- run gradle app `./gradlew bootRun`


- run Maven app `./mvnw spring-boot:run`


#### Docker Usage


- build dev docker image `docker build . -t underpost-sb`


- create volume `docker volume create underpost-sb-vol`


- run dev image `docker run --name live-underpost-sb -p 41061:8080 underpost-sb`


- get a shell terminal inside your container `docker exec -ti live-underpost-sb bash`
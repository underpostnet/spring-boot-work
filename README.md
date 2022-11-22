### Dependencies

**spring-boot-starter-web** : It is used for building web layer, including REST APIs, applications using Spring MVC. Uses Tomcat as the default embedded container.

**spring-boot-starter-data-jpa** : It includes spring data, hibernate, HikariCP, JPA API, JPA Implementation (default is hibernate), JDBC and other required libraries.

**h2** : Though we can add any database easily using datasource properties in application.properties file, we are using h2 database in reduce unnecessacery complexity.

**spring-boot-starter-test** : It is used to test Spring Boot applications with libraries including JUnit, Hamcrest and Mockito.

### Usage


- run gradle app `./gradlew bootRun`


- run Maven app `./mvnw spring-boot:run`



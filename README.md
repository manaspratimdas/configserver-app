**Config Server**

External Configuration: Using Spring Cloud Config Server and library, configuration across multiple services can be managed centrally. This is particularly useful in a microservices environment where there are many services to manage.

**Prompt**
1. As a Java developer using Java 11, I am in need of detailed instructions to set up a config server for my Spring Boot application. Please provide the following:
The necessary Maven dependencies to be imported into the application.
Any configuration files that need to be created or existing ones that require updates, given that I am using an application.properties file for configuration.
Steps on how the config server can be integrated with the client Spring Boot application.
Kindly organize this information into a step-by-step guide to facilitate the process.

2. I have configured the following properties in the config server to connect to GitHub:
server.port=7000
spring.cloud.config.server.git.uri=https://github.com/manaspratimdas/configserver
spring.cloud.config.server.git.username=manaspratimdas
spring.cloud.config.server.git.password=XXX 
The file in GitHub is created as follows: https://github.com/manaspratimdas/configserver/blob/main/patient-record-service.properties.
Could you guide me on how to access the configuration file once the config server is started?

3. As a Java developer using Java 11, I need a comprehensive guide on configuring a Spring Boot application with a Config server. Please provide the following:
Required Maven dependencies to be imported into the application.
Any configuration files that need to be created or existing ones that should be updated. Note that I am using an application.properties file for configuration.
Steps on how the config server can be integrated with the client Spring Boot application, which is utilizing the following:
groupId: org.springframework.boot
artifactId: spring-boot-starter-parent
version: 2.1.5.RELEASE
Please organize this information into a step-by-step guide to simplify the process.



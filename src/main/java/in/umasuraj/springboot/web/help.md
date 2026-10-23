## JSP

## Login JSP

## Logging

Knowing what to log is an essential skill to be a great programmer

Spring Boot makes logging easy

## Logging Dependency
spring-boot-starter-logging

Default: Logback with SLF4j

Typical Log Levels: ERROR, WARN, INFO, DEBUG, or TRACE

logging.level.some.path=debug
logging.level.some.other.path=error
logging.file.name=logfile.log
private Logger logger = LoggerFactory.getLogger(this.getClass());
logger.info("postConstruct");

## Dispatcher Servlet

localhost:8080/login

B1: Identifies Correct Controller Method
/login => LoginController.goToLoginPage()

B2: Executes Controller Method
=> Puts data into model
=> Returns view name => login

B3: Identifies Correct View using View Resolver
/WEB-INF/jsp/login.jsp

B4: Executes View

## Todo

id
username
description
targetDate
done

Database (MySQL)
Static List of Todos => Database(H2, MySQL)

TodoController
listTodos.jsp

## Session Scopes vs Request Scopes

-- All requests from browser are handled by our web application deployed on a server

-- Request Scope: Active for a single request ONLY
-- Once the response is sent back, the request attributes will be removed from memory
-- These cannot be used for future requests
-- Recommended for most use cases

-- Session Scope: Details stored across multiple requests
-- Be careful about what you store in session (Takes additional memory as all details are stored on
server)

## Bootstrap CSS

/META-INF/resources/webjars/
bootstrap/5.1.3/css/
bootstrap.min.css
/META-INF/resources/webjars/
bootstrap/5.1.3/js/bootstrap.min.js

## Validations with Spring Boot
1: Spring Boot Starter Validation
pom.xml

2: Command Bean (Form Backing Object)
2-way binding (todo.jsp & TodoController.java)

3: Add Validations to Bean
Todo.java

4: Display Validation Errors in the View
todo.jsp


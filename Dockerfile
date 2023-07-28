# Start with a jdk image
FROM amazoncorretto:17-alpine-jdk

ARG SERVICE_PORT

# Expose Application on port
EXPOSE $SERVICE_PORT

COPY target/taskapi-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
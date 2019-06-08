FROM openjdk:12-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"] 

FROM openjdk:12-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"] 

FROM openjdk:12-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-cp","app:app/lib/*","com.toushishu.helloservice.HelloApplication"]

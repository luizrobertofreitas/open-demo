FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/open-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

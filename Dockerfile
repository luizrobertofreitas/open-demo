FROM centos

RUN yum install -y \
       java-1.8.0-openjdk \
       java-1.8.0-openjdk-devel

ENV JAVA_HOME /etc/alternatives/jre

VOLUME /tmp
EXPOSE 8080
COPY build/libs/open-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

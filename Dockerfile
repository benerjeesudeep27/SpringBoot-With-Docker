FROM openjdk:8
MAINTAINER "Sudeep Banerjee"
EXPOSE 8080
COPY target/springboot-docker-project.jar  /usr/app/
WORKDIR /usr/app/
ENTRYPOINT [ "java", "-jar", "springboot-docker-project.jar" ]
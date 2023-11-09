FROM openjdk:17

LABEL maintainer="samjay.com"

ADD target/simple-project-0.0.1-SNAPSHOT.jar simple-project.jar

ENTRYPOINT ["java", "-jar", "simple-project.jar"]
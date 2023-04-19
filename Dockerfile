FROM openjdk:8

VOLUME /tmp

ADD target/cardx-service.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

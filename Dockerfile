FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/myapp-1.0-jar-with-dependencies.jar app.jar

CMD ["java", "-jar", "app.jar"]

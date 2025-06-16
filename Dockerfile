FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/DevOps-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

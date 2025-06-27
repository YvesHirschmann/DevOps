FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the built classes and dependencies
COPY target/classes ./classes
COPY target/dependency ./dependency

# Set the entrypoint to start the CalculatorApi HTTP server
ENTRYPOINT ["java", "-cp", "classes:dependency/*", "de.fherfurt.fhe.CalculatorApi"]

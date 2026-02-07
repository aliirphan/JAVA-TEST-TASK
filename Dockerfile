# 1. Use lightweight Java runtime
FROM eclipse-temurin:17-jdk-jammy

# 2. Set working directory
WORKDIR /app

# 3. Copy jar file
COPY target/Java-Test-Task-0.0.1-SNAPSHOT.jar JavaTestTask.jar

# 4. Expose port (same as server.port)
EXPOSE 9090

# 5. Run application
ENTRYPOINT ["java","-jar","JavaTestTask.jar"]




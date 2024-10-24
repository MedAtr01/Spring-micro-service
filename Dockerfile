# Start with a base image containing JDK runtime
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the target directory into the container
COPY target//comptes_bancaires-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8081

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

FROM eclipse-temurin:17-jdk

# Install Chromium + ChromeDriver for ARM64
RUN apt-get update && apt-get install -y wget gnupg unzip chromium chromium-driver

WORKDIR /app
COPY target/AutomationFramework-1.0-SNAPSHOT.jar selenium-tests.jar

CMD ["java", "-jar", "selenium-tests.jar"]
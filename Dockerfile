# Base image
FROM eclipse-temurin:17-jdk-alpine

# Çalışma dizini
WORKDIR /app

# Maven ve kaynakları kopyala
COPY pom.xml .
COPY src ./src

# Maven build (testleri atla)
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Jar dosyasını çalıştır
CMD ["java", "-jar", "target/nakliye-0.0.1-SNAPSHOT.jar"]

# Port
EXPOSE 8080

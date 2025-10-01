# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app
# Önce mvnw ve pom.xml'i kopyala
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src ./src

# mvnw'yi executable yap
RUN chmod +x mvnw

# Maven Wrapper ile build et
RUN ./mvnw clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE $PORT

ENTRYPOINT ["sh", "-c", "java -jar -Dserver.port=${PORT} app.jar"]
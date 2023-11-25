FROM maven:3.9.0-eclipse-temurin-17-alpine as build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:17
COPY --from=build /target/a3-1.0.0.jar a3.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","a3.jar"]
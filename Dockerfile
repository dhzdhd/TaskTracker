# Build cmd
# ./gradlew bootBuildImage --imageName=dhzdhd/task-tracker-docker
# docker build -t dhzdhd/task-tracker-docker .

FROM openjdk:17-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
FROM eclipse-temurin:17-jre
LABEL authors="GarrettCooperDev"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
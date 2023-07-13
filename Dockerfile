FROM bellsoft/liberica-openjdk-debian
EXPOSE 8099
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT  ["java","-jar","/app.jar"]
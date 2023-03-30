FROM openjdk:11-jdk-slim
#VOLUME /tmp
EXPOSE 8080
ADD ./Content-calender-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

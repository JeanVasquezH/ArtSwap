FROM amazoncorretto:21-alpine-jdk
MAINTAINER ESMERALDA
COPY target/ArtSwapv1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]
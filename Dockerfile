FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/ArtSwapv1-0.0.1-SNAPSHOT.jar GiftServices.jar
ENTRYPOINT ["java", "-jar","/GiftServices.jar"]
FROM amazoncorretto:17-alpine3.17-jdk
LABEL authors="mapco"
WORKDIR /cdsapi
COPY ./target/cdsapi-0.0.1-SNAPSHOT.jar ./cdsapi.jar
EXPOSE 8080
CMD ["java", "-jar", "cdsapi.jar"]

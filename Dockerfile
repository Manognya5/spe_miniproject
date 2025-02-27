FROM openjdk:17

COPY ./calculator/target/calculator-1.0-SNAPSHOT.jar ./

WORKDIR ./

CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]
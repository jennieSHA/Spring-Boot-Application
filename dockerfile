FROM openjdk:17-oracle

WORKDIR /app

COPY target/producerService-0.0.1-SNAPSHOT.jar /app/producerService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "producerService-0.0.1-SNAPSHOT.jar"]
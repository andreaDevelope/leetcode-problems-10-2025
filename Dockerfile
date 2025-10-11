# Usa l'immagine base con Java 21
FROM openjdk:21-jdk-slim

# Imposta la directory di lavoro nel container
WORKDIR /app

# Copia il JAR compilato nel container con nome specifico
COPY target/mio-progetto-java-1.0-SNAPSHOT.jar app.jar

# Avvia l'applicazione Java console
ENTRYPOINT ["java", "-jar", "app.jar"]

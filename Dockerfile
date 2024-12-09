# Etapa 1: Build
FROM maven:3.9.4-eclipse-temurin-21 AS build

# Define o diretório de trabalho no container
WORKDIR /app

# Copia apenas os arquivos essenciais para o build
COPY pom.xml ./
COPY src ./src

# Executa o build com Maven
RUN mvn clean package -DskipTests

# Etapa 2: Execução
FROM openjdk:21-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Copia o artefato gerado no estágio de build
COPY --from=build /app/target/*.jar app.jar

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]

# Usa uma imagem com Maven e JDK 17 já instalados
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório correto onde o Maven será executado
WORKDIR /app

# Copia apenas os arquivos do Maven primeiro (para melhor cache no Docker)
COPY pom.xml .
COPY src ./src

# Executa o build para gerar o JAR
RUN mvn clean package -DskipTests

# Cria a imagem final com apenas o JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o JAR gerado para a nova imagem
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
# Usa uma imagem com Maven e JDK 17 já instalados
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório correto onde o Maven será executado
WORKDIR /app

# Copia apenas os arquivos do Maven primeiro (para melhor cache no Docker)
COPY pom.xml .
COPY src ./src

# Executa o build para gerar o JAR
RUN mvn clean package -DskipTests

# Cria a imagem final com apenas o JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o JAR gerado para a nova imagem
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
# Usa uma imagem com Maven e JDK 17 já instalados
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório correto onde o Maven será executado
WORKDIR /app

# Copia apenas os arquivos do Maven primeiro (para melhor cache no Docker)
COPY pom.xml .
COPY src ./src

# Executa o build para gerar o JAR
RUN mvn clean package -DskipTests

# Cria a imagem final com apenas o JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o JAR gerado para a nova imagem
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
# Usa uma imagem com Maven e JDK 17 já instalados
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório correto onde o Maven será executado
WORKDIR /app

# Copia apenas os arquivos do Maven primeiro (para melhor cache no Docker)
COPY pom.xml .
COPY src ./src

# Executa o build para gerar o JAR
RUN mvn clean package -DskipTests

# Cria a imagem final com apenas o JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o JAR gerado para a nova imagem
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]

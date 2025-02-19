# Etapa 1: Usar uma imagem que já tenha Maven instalado
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos do projeto para o container
COPY . .

# Compila o projeto e gera o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem final apenas com o JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia apenas o JAR gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]

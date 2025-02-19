# Usa uma imagem do OpenJDK
FROM eclipse-temurin:17-jdk AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o código-fonte do projeto para o container
COPY . .

# Compila o projeto e gera o JAR
RUN ./mvnw clean package -DskipTests

# Segunda etapa: cria a imagem final para rodar a aplicação
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR gerado da fase de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]

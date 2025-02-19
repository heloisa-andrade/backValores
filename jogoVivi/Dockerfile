# Usa uma imagem com Maven e JDK 17 já instalados
FROM maven:3.8.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY jogoVivi/pom.xml .
COPY jogoVivi/src ./src

# Agora copia todo o código-fonte
COPY . .

# Executa o Maven para gerar o JAR
RUN mvn clean package -DskipTests

# Usa apenas o JAR na imagem final
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o JAR gerado
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]

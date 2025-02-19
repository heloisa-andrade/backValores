# Usa a imagem oficial do OpenJDK 17 (ou outra versão que seu projeto suporte)
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado para dentro do container
COPY target/jogoVIVI-0.0.1-SNAPSHOT.jar app.jar

# Define a porta que a aplicação vai usar
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]

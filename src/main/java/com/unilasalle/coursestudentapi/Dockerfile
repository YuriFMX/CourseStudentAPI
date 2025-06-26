# Use uma imagem base oficial do OpenJDK
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo pom.xml e baixa as dependências
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

# Copia o código-fonte
COPY src ./src

# Compila o projeto e gera o JAR (ignora testes)
RUN ./mvnw clean package -DskipTests

# Expõe a porta 8080
EXPOSE 8080

# Executa o JAR
CMD ["java", "-jar", "target/CourseStudentAPI-0.0.1-SNAPSHOT.jar"]
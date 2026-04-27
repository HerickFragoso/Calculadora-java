FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY main.java .

RUN javac main.java

CMD ["java", "main"]


FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY main.java .
COPY Calculos.java .

RUN javac main.java Calculos.java

CMD ["java", "main"]
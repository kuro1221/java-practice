FROM arm64v8/openjdk:17-jdk-slim

WORKDIR /app

COPY ./src /app/src

RUN javac -d /app/bin /app/src/com/task/*.java

CMD ["java", "-cp", "/app/bin", "com.task.Main"]

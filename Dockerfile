FROM maven:3-jdk-8 AS build

WORKDIR /src
COPY ./ /src

RUN mvn package

FROM openjdk:8-jre-slim AS runtime

WORKDIR /app
COPY --from=build /src/target/app.jar .

CMD java -jar /app/app.jar

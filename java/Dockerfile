FROM gradle:jdk18 as build
WORKDIR /springbuild
COPY . /springbuild
RUN gradle build

FROM openjdk:jre as run
WORKDIR /app
COPY --from=build /springbuild/build/libs/springbuild-0.0.1-SNAPSHOT.war /app/spring.war
ENTRYPOINT ["java", "-jar", "spring.war"]

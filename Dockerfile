# demo-0.0.1-SNAPSHOT

FROM openjdk:17-jdk-alpine AS builder
WORKDIR /target/dependency
ARG APPJAR=target/*.jar
COPY ${APPJAR} demo-0.0.1-SNAPSHOT.jar
RUN jar -xf ./demo-0.0.1-SNAPSHOT.jar

FROM openjdk:8-jre-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /demo-0.0.1-SNAPSHOT/lib
COPY --from=builder ${DEPENDENCY}/META-INF /demo-0.0.1-SNAPSHOT/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /demo-0.0.1-SNAPSHOT

EXPOSE 8080

ENTRYPOINT ["java","-cp","demo-0.0.1-SNAPSHOT:demo-0.0.1-SNAPSHOT/lib/*","com.work.demo.DemoApplication"]
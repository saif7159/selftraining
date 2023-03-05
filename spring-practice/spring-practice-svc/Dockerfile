FROM openjdk:latest
RUN echo hi im docker
EXPOSE 9080
COPY build/libs/spring-practice-svc-0.0.1-SNAPSHOT.jar spring-practice-0.0.1.jar 
ENTRYPOINT [ "java","-jar", "/spring-practice-0.0.1.jar" ]
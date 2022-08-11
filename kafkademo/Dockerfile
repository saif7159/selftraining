FROM openjdk:8-jdk-alpine
EXPOSE 9098
COPY build/libs/kafkademo-0.0.1.jar kafkademo
ENTRYPOINT ["java","-jar","/kafkademo"]
# ENTRYPOINT ["java","-jar","/build/libs/kafkademo-0.0.1.jar"]
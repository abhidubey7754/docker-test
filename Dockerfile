FROM eclipse-temurin:17-jdk

LABEL key="abhishek"

WORKDIR /docker

COPY target/test-docker-network.jar .

ENTRYPOINT ["java","-jar","test-docker-network.jar"]
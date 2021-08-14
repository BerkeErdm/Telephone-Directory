FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /spring-boot-docker/lib
COPY ${DEPENDENCY}/META-INF /spring-boot-docker/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /spring-boot-docker
ADD build/libs/spring-boot-docker.jar spring-boot-docker.jar
CMD java -jar spring-boot-docker.jar
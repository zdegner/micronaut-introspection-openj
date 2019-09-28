FROM adoptopenjdk/openjdk11-openj9:alpine-jre
RUN apk --no-cache add curl
COPY build/libs/hello-world-java-0.1.jar foo.jar
CMD java ${JAVA_OPTS} -jar foo.jar

FROM java:8
ADD spring-config-server-1.0-SNAPSHOT.jar app.jar
VOLUME /target
VOLUME /tmp
RUN bash -c 'touch /app.jar'
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
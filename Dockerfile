FROM fabric8/java-jboss-openjdk8-jdk:1.0.13

ENV JAVA_APP_JAR catalog-1-1.0-SNAPSHOT-swarm.jar
ENV AB_OFF true

EXPOSE 8080

ADD target/catalog-1-1.0-SNAPSHOT-swarm.jar /app/

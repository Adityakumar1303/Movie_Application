# this is for adding jdk


FROM openjdk
WORKDIR user/src
EXPOSE 0101
ADD ./target/jwt-0.0.1-SNAPSHOT.jar /user/src/jwt-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "jwt-0.0.1-SNAPSHOT.jar"]


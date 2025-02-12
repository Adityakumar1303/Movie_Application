
FROM openjdk
WORKDIR usr/lib
ENV MONGO_DATABASE="Movies"
ENV MONGO_URL="mongodb://localhost:27017/Movies"
ADD ./target/MovieApp-0.0.1-SNAPSHOT.jar /usr/lib/MovieApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","MovieApp-0.0.1-SNAPSHOT.jar"]
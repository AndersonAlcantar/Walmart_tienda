FROM openjdk:11-jdk-slim
COPY "./target/demo-crud-mongo-v1.war" "app.war"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.war"]
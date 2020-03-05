FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/sample2.jar sample2.jar
ENTRYPOINT ["java","-jar","sample2.jar"]
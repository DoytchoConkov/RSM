FROM openjdk:11.0.7-jre

COPY target/RepairShopManager-v1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
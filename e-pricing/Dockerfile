FROM openjdk:11-jre-slim
LABEL maintainer=madhi.krishnan@fyndna.com

ARG JAR_FILE=E-PRICING_JAR
COPY ${JAR_FILE} /usr/local/lib/e-pricing.jar
EXPOSE  8081
ENTRYPOINT ["java","-jar","/usr/local/lib/e-pricing.jar"]


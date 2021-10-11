FROM openjdk:11-jre-slim
LABEL maintainer=madhi.krishnan@fyndna.com

ARG JAR_FILE=PAYMENT_JAR
COPY ${JAR_FILE} /usr/local/lib/payment.jar
EXPOSE  8082
ENTRYPOINT ["java","-jar","/usr/local/lib/payment.jar"]


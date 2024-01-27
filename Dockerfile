FROM tomcat:9.0.52-jrell-openjdk-slim
COPY ./target/mmt*.jar /usr/local/tomcat/webapps
Expose 8080
USER mmt-ms
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]
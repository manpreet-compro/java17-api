# Alpine Linux with OpenJDK JRE
FROM amazoncorretto:17

# Copy war file
COPY hello.jar /hello.war

# run the app
CMD ["/usr/bin/java", "-jar", "/hello.war"]
FROM tomcat:9

# Copy files from local disk to image
COPY Titan.war /usr/local/tomcat/webapps/
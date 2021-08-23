FROM openjdk:11.0-buster
ADD target/controlAcceso-0.0.1-SNAPSHOT.jar /usr/share/app.jar
ENV SQL_HOST=""
ENV SQL_PORT="3306"
ENV DB_NAME=""
ENV SQL_USER=""
ENV SQL_PASS=""
ENV LDAP_HOST="localhost"
ENV LDAP_PORT="1186"
ENV BASE_LDAP="cn=admin"
ENV USER_LDAP="cn=admin"
ENV PASSWORD_LDAP="adminpass"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]

#-e sqlURL="192.168.1.133" -e sqlPort="5555" -e nameofDB="northwind" -e userNameSql="andro" -e passwordSql="andro"
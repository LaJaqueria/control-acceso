FROM openjdk:11.0-buster
ADD target/inventario-0.0.1-SNAPSHOT.jar /usr/share/app.jar
ENV sqlURL=""
ENV sqlPort=""
ENV nameofDB=""
ENV userNameSql=""
ENV passwordSql=""
ENV ldapURL=""
ENV sqlPort=""
ENV baseLdap=""
ENV userNameLdap=""
ENV passwordLdap=""

ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]

#-e sqlURL="192.168.1.133" -e sqlPort="5555" -e nameofDB="northwind" -e userNameSql="andro" -e passwordSql="andro"
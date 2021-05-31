docker run --env SQL_HOST=host.docker.internal --env SQL_PORT=3306  --env DB_NAME=hubrfidlajaqueria
--env SQL_USER=andro --env SQL_PASS=andro -p 5555:8080 jaqueria/control-acceso:0.0.1
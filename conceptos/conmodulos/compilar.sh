javac -d compilado \
    --module-source-path . \
    moduloa/*.java \
    moduloa/com/curso/paquetea/*.java \
    modulob/*.java \
    modulob/es/curso/paqueteb/*.java \
    modulob/es/curso/paqueteb/impl/*.java 

java --module-path compilado -m moduloa/com.curso.paquetea.App
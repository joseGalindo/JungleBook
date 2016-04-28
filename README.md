# JungleBook

Para instalar nuestro jar:
Una vez que tenemos el .jar de nuestra practica 5 deberemos agregar lo siguiente para agregarlo a los repositorios locales de maven,

mvn install:install-file -Dfile=Practica5-1.0.jar -DgroupId=mx.unam.fciencias 
    -DartifactId=Practica5 -Dversion=1.0 -Dpackaging=jar
    

Esto es, si en nuestro pom tiene las opciones de
<groupId>mx.unam.fciencias</groupId>
<artifactId>Practica5</artifactId>
<version>1.0</version>

Si no es asi, deberan agregar los parametros al install como vienen en su pom.

Una vez agregada la biblioteca, que marca success, deberemos modificar en el pom.xml la siguientes lineas
<dependencies>
    <dependency>
        <groupId>mx.unam.fciencias</groupId>
        <artifactId>Practica5</artifactId>
        <version>1.0</version>        
    </dependency>
</dependencies>

Compilamos y confirmamos que no marca ningun error, en NetBeans deberá detectar las clases que estan en nuestra biblioteca,
ListaLigada, Pila, Cola, Celda, etc

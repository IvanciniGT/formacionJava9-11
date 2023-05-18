# Estructura de un fichero de diccionario


Stream<String>
--------------------------------
"manzana=Fruta del Manzano"
"melón=Fruta del melonero|Persona con pocas luces... Eres un melón!"
"banana=Fruta del bananero"
"mañana=Hoy no... mañana !"

    MAP (    String.split("=") -> String[] )
    

Stream<String[]>
--------------------------------
["manzana","Fruta del Manzano"]
["melón","Fruta del melonero|Persona con pocas luces... Eres un melón!"]
["banana","Fruta del bananero"]
["mañana","Hoy no... mañana !"]
  ^^^^          ^^^^^^
  Clave         significados -> String -> List<String>
  ^
  normalizar
  
Map<String, List<String>>


---
String
    "Fruta del melonero|Persona con pocas luces... Eres un melón!"

List<String>
    Arrays.asList(String.split("|"))
    
    
    Ángel
    ángel
    
    Ángela
    ángela
    
Collectors.toMap(
    // Funcion de la que sacar la clave
    datoOriginalDelStream -> ... clave
    ,
    // Funcion de la que sacar el valor
    datoOriginalDelStream -> ... valor
    ,
    // Funcion de fusión de valores
    // Esta función es invocada cuando hay claves repetidas
    valor1, valor2 -> valor final UNICO 
)

---


# MAVEN

Herramienta que nos permite automatizar tareas en un proyecto JAVA

MAven per sé no sabe ná. Todo lo hace mediante plugins

Cuando trabajomos con Maven :

    proyecto
        |- src
        |   |-main
        |   |   |-java
        |   |       |- Modulos, paquetes, clases...
        |   |-test
        |       |-java
        |           |- Modulos, paquetes, clases...
        |- target
        |   |- classes
        |   |- test-classes
        |   |- surefire-reports
        |   |- artefacto.jar (.war, .ear)
        |- pom.xml
        
A maven le podemos pedir que ejecute tareas en nuestro proyecto: GOALS
- compile
- test-compile
- test
- package
- install
- clean
        
        
# Pom.xml

Es el archivo de configuración de maven para nuestro proyecto
- Datos del proyecto
    - Datos identificativos
        - groupId       ID del grupo de proyecto
        - artifactId    ID del proyecto
        - version       versión actual del producto que estamos trabajando
    - Otros metadatos
        - name más largo
        - description
        - url
        - licencia
- Dependencias
- Plugins . Maven por defecto aunque yo no lo ponga viene con 8/10 plugins ya configurados
- Propiedades (configuraciones para los plugins)
 

PROYECTO DICCIONARIOS 
    -> Carpeta
    -> Repo
    -> Maven
    
    Modulos
        -> Carpeta
        -> Repo
        -> Maven




maven, cuando necesita buscar un artefacto:
    - Dependencia
    - Proyecto padre

Los busca:

1º En el repositorio de maven en la maquina donde maven se ejecuta: .m2
    Si alli no lo encuentra:
2º Buscarlo en el repositorio que esté configurado en el archivo ~/.m2/settings.xml
En una empresa, en este fichero apuntamos a un repositorio de artefactos propio:
    - Nexus             <   .jar
    - Artifactory       <   .pom
    
    
    
# Mandar el proyecto a sonarqube

    mvn sonar:sonar \
    -Dsonar.token=squ_299236cb68259837a4e2408dd10a2a8bc2bb9a0b \
    -Dsonar.host.url=http://3.249.224.135:81/
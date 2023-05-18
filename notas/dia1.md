# JAVA (Novedades v9 -> 11)

Java es un lenguaje de programación.
           --------

Lenguaje: Tiene una GRAMATICA: morfología, sintaxis, semantica 

Java es un lenguaje FORMAL (formales vs naturales)

Lenguaje MATEMATICO: 2 + 7 = 10
                     3 · 4 + (2 - 5) / 10

## Características de JAVA

- Paradigmas que permiten hablar.
    Un paradigma no es sino una forma de usar un lenguaje para expresar un concepto/idea.
    
        Felipe, debajo de la ventana hay una silla.   =>  Frase enunciativa, afirmativa
        Felipe, pon una silla debajo de la ventana    =>  Frase imperativa, doy una orden
        Felipe, quiero una silla debajo de la ventana =>  Frase desiderativa
        Felipe, debajo de la ventana debe haber una silla

    - Imperativo: Cuando damos una serie de instrucciones que de bene ejecutar en secuencia.
                    Para controlar la sencuencia (el flujo) de órdenes, usamos: if, else, for, while...
    - Procedural: Cuando el lenguaje me ofrece la posibilidad de crear FUNCIONES / METODOS / PROCEDIMIENTOS
                    y de invocarlas posteriormente
    - Programación orientada a objetos: Cuando el lenguaje me da la posibilidad de definir mis propios TIPOS DE DATOS.
                    Tipos de datos que tendrán sus propias propiedades y funciones.
                    
                        En computación trabajamos con DATOS: Los datos tienen distinta naturaleza:
                                                            Propiedadas             Funciones
                            -   Numeros                         valor               valor absoluto
                                - Enteros
                                    - Cortos
                                    - Largos
                                    - Gigantes
                                - Decimales
                            - Lógicos: SI/NO, true/false        valor
                            - Fecha                             dia                 Cae en año bisiesto
                                                                mes                 A cuanto estás de ahora
                                                                año
                            - Textos                            texto               longitud, versión en Mayúsculas
                            - Listas de cosas
                            - Arboles de cosas
                            - Quiero tener el tipo de datos: Usuario    nombre      modificar un dato
                                                                        email       mandar un correo
                                                                        edad
    - Programación funcional: (Se introduce en Java 1.8)
                    Cuando el lenguaje me permite que una variable referencia a una función!
                    Desde el momento que podemos hacer esto:
                    - Podemos crear funciones que reciban como argumentos otras funciones
                    - Podemos crear funciones que devuelvan otras funciones

- Lenguajes compilados vs lenguajes interpretados

    Cuando escribimos código (un programa) usamos un determinado lenguaje de programación: C, JAVA, PYTHON
    Quién ejecuta ese programa en última instancia? Sistema Operativo
    Qué lenguajes habla un SO? Habla JAVA? NOP, C? NOP, PYTHON? NASTI 
    Los SO hablan su propio lenguaje
    
    Es necesario traducir nuestro programa al lenguaje del SO donde lo voy a ejecutar (y de hecho a la versión de SO
    compatible con la arquitectura de microprocesador que tengo en esa máquina donde voy a ejecutar)
    - Lenguajes compilados:   C, C++, C#, Fortran, ADA 
        Compilación: El proceso de traducir nuestro código en el lenguaje que yo he elegido al lenguaje del SO de turno.
                     Es una traducción ESTATICA.
        DESVENTAJA:
            - Necesito gestionar muchas traducciones de mi programa que distribuyo
        VENTAJA: 
            - Más eficiente. La comunicación en ejecución es más directa (más clara, sin intermediarios)
    - Lenguajes interpretados: Python, JS, ps1, bash
        Yo distribuyo el programa en mi lenguaje (PYTHON, JS, ESPAÑOL)
        En este caso se usa un INTERPRETE, que va traduciendo el lenguaje en TIEMPO REAL!
        VENTAJA:
            - Solo distribuyo un código.
        DESVENTAJA:
            - LA comunicación es menos eficiente, por haber un intermediario
    
        JAVA es un lenguaje MUY RARO !!!! porque es compilado e interpretado a la vez
        
            .java -> compilamos -> .class       ->      interprete  -> generar las órdenes al SO de turno
            Lenguaje JAVA           Lenguaje byte-code      JVM
                                                                Just In Time (JIT) compiler
                                                                    En versión 1.2 -> Hotspot
                                                                                        Caché de compilaciones
        Desde versión 11 de JAVA, podemos ejecutar en la JVM directamente un archivo .java, sin necesidad de compilarlo previamente
            INTEPRETADO PURO !
                                                                                        
- Lenguajes de tipado estático / lenguajes de tipado dinámico
    - Lenguajes de tipado estático (JAVA, C, C++...)
        Al definir una variable la variable lleva asociado un TIPO,
        el TIPO de dato del DATO al que esa variable puede apuntar.

        Ventajas:
            - Puedo en un momento dado (COMPILACION), revisar que todos los tipos de datos ENCAJAN. GUAY 
              Me permite detectar errores antes de EJECUTAR UN PROGRAMA
            - Nada más ver la definición de una función, sé cómo se comporta
                ```py 
                 public URL generarInforme(boolean titulo, List<Dato> datos){    <<< DEFINICION DE LA FUNCION
                    // ... codigo
                 public Optional<URL> generarInforme(boolean titulo, List<Dato> datos){    <<< DEFINICION DE LA FUNCION
                    // ... codigo
                }
                ```
                    ESTO ES VERDAD A MEDIAS: El hecho de que sé cómo hablar con esa función: CAGADAS DE JAVA 
                        Podría devolver null
                    
    - Lenguajes de tipado dinámico (JS, PYTHON)
        Podemos definir variables que apunten a datos de cualquier tipo.
        Las variables carecen de TIPO. Los datos son los que tienen tipo.
        
        Desventaja:
            - Propensos a generar errores EN TIEMPO DE EJECUCION 
            - Al ver la definición de una función NO TENEMOS NI IDEA DE COMO SE COMPORTA EL CODIGO > BASICO CUANDO TRABAJO EN EQUIPO !
                ```py 
                 def generar_informe(titulo, datos):    <<< DEFINICION DE LA FUNCION
                    # ... codigo
                ```
                    - O miro el código (si es que lo tengo) y me llevará un rato
                    - O miro la documentación.. si es que la han creado... y también me lleva rato
        Ventaja:
            - Es más cómodo
            
            ```js
                var lista = [1,2,3]
            ```
            ```py
                lista = [1,2,3]
            ```
            ```java
                List<Integer> lista = ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);

                List<Integer> lista = Arrays.asList(1,2,3);
                
                List<Integer> lista = List.of(1,2,3); // Desde java 9
                
                List<Integer> lista = List.of(1,2,3);
                
                var lista = List.of(1,2,3);             // Desde Java 10 SI. INFERENCIA DE TIPOS 
                    // Sigue siendo un List<Integer>
                    
                // PERO OJO: Esa linea de JAVA 10, no es igual a la linea de JS
                // El var de JAVA no es igual al var de JS
                // Ya que JS es un lenguaje de tipado dinámico
                // Y JAVA, pormucho que se haya incluido esa linea, sigue siendo de tipado ESTATICO.
                // El var de JAVA hace INFERENCIA DE TIPOS.
                
                // NOTA: Esto no siempre está considerado una buena práctica... hablaremos de ello !
            ```
                

            
Qué os parece mejor? Depende
---

# Variable

Al menos en JAVA, PYTHON, JS: 

x No es un espacio de almacenamiento donde pongo datos. No es un cajón.

√ Es una referencia a un dato que tengo en memoria.

```java
String texto = "hola";          // Statement ~ Sentencia | Enunciado | Frase
```
De cuantas partes se compone este Statement?
- "hola"            -> Crear un Dato de tipo String con valor "hola" en memoria RAM
- String texto      -> Define una variable, llamada "texto", que puede apuntar a datos de tipo String
- =                 -> Asigna la variable "texto" al valor "hola"

```java
texto = "adios";          
```
- "adios"           -> Crear un Dato de tipo String con valor "adios" en memoria RAM.
                        Donde de la RAM? en el mismo sitio donde estaba guardado el texto "hola"? NO, NUNCA 
                            En este momento tengo 2 textos en memoria: "hola" y "adios"
- texto             -> tomo la variable llamada "texto", que puede apuntar a datos de tipo String
- =                 -> Asigna la variable "texto" al nuevo dato "adios"
                            Llegados a este punto, el DATO "hola" se convierte en BASURA (Garbage)
                            ya que ninguna variable apunta a él, y por tanto es irrecuperable de la memoria.
                            En algún momento entrará el GARBAGE COLLECTOR (recolector de basura) y se lo llevará.

JAVA es un lenguaje que hace un autentico DESTROZO y un uso INEFICIENTE de la memoria ram.
Bueno o malo? Esto en JAVA es una FEATURE ! Java se diseño con ese criterio:
VAMOS A MONTAR UN LENGUAJE QUE DESTROCE LA RAM!
Simplemente se echaron cuentas:
- Qué cuesta más: X horas de desarrollador de pata negra gestionando guay la RAM
                  O UNA PASTILLA MÁS DE RAM PARA EL SERVIDOR?   

UNA COSA ES EL DATO Y OTRA COSA ES UNA VARIABLE (que apunta a un DATO)
El DATO per sé tiene un TIPO: Número, texto, fecha, usuario

Hay lenguajes de programación que permiten definir variables que apunten a datos de cualquier tipo.
Mientres que hay lenguajes de programación que cuando definimos una variable SOLO permiten que la variable apunte a datos 
de un tipo concreto.


# Lenguajes más usados hoy en día en el mundo?

- Javascript
- Python
...
- JAVA -> Ha caído en desuso. Ha quedado como lenguaje de nicho.

---

En los albores del 2000 JAVA era el lenguaje!
- App desktop: JAVA
- App web: JAVA (php)
- App smartphone (Android): JAVA
- App de software embebido: JAVA

Esto ha cambiado radicalmente
- App desktop: -
- App web: 
    - Frontend: JAVA (JSPs, JFCs) -> JS         ReactJS, AngularJS, VueJs, Polymer -> WebComponents -> Estándar W3c (2014)
    - Backend:  JAVA + Springboot + Librerias -> REST
- App smartphone (Android): JAVA -> kotlin
- App de software embebido: JAVA -> [C , C++], GO, RUST, Python


# KOTLIN

Es un lenguaje que crea la gente de JetBrains -> Montan entornos de desarrollo -> IntelliJ < Mejor IDE para Java
Google usaba para desarrollo Eclipse (una versión tuneada de Eclipse) -> JetBrains -> AndroidStudio (IntelliJ Capao)

Esta gente hace entornos de desarrollo brutales: PyCharm, CLyon, Webstorm



            .java -> compilamos -> .class       ->      interprete  -> generar las órdenes al SO de turno
            Lenguaje JAVA           Lenguaje byte-code      JVM
                                                                Just In Time (JIT) compiler
                                                                    En versión 1.2 -> Hotspot
                                                                                        Caché de compilaciones
            .kotlin -> compilamos -> .class

# Scala 

            .scala -> compilamos -> .class


# Versiones de JAVA

version 1.0                 1996            <<< El desarrollo y la propiedad de Java era de Sun microsystems
version 1.1                 1997
version 1.2                 1998
version 1.3                 2000
version 1.4                 2002
version 1.5                 2004
version 1.6                 2006
    <<<<< Vino la primera muerte de JAVA
            Una empresa compra a Sun microsystems: Oracle
                Oracle era el único gran fabricante de software que no tenía hardware -> EXADATA
version 1.7                 2011        + 5 años?   
versión 1.8                 2014        + 3 años
    <<<< Vino la puntilla 
        Oracle anuncia que cobrará 25$ por usuario al año que tenga instalad la JVM
                                   50$ por core en servidor
            Por suerte, hubo una empresa con la capacidad de hacer frente a un gigante como es Oracle en favor de JAVA
                GOOGLE y presionó a Oracle
                Acuerdos: 
                    - Convertir a la JVM en un estandar, de forma que pueda haber muchas implementaciones de la misma.
                    - Liberar JEE -> Donó a la función Jakarta para su gestión
                        J2EE : Java Enterprise Ediction (colección de estandares ~ Framework): JDBC, JMS , JPA, Servlet, JSPs
                        JEE  : Java Enterprise Ediction 
                        JEE  : Jakarta Enterprise Edition
                    - Generar una versión de Java cada 6 meses
                ...
                Pero ... Google no perdona!
                    -> Abandonar Java como lenguaje de desarrollo en Android -> Kotlin
                    -> Node (NodeJS)
                        Node es el antiguo interprete de JS que se desarrollaba dentro del navegador web CHROMIUM
                                Chromium es Opensource y la base:
                                    - Chrome
                                    - Edge
                                    - Safari
                                    - Opera
                                    
                                    - firefox ! bien ! siempre nos quedará la resistencia!
                        En un momento dado, Google desgaja el proyecto del interprete JS del navegador Chromium
                        Y lo convierte en un proyecto nuevo: Node
                        A partir de ese momento JS no está limitado a ejecutarse dentro de un navegador y desata todo su potencial
                        Node en el mundo JS es el quivalente a la JVM en el mundo JAVA
                            Van surgiendo librerias:
                                - Express, que permite montar un servidor web encima de node -> Servicios de Backend en JS

versión 9                   2017        + 3 años -> JIGSAW
    Cambios gordos
version 10                  2018        + 6 meses
    Poca cosas... Más ajustes de cosas anteriores que nuevas cosas
version 11                  2018        + 6 meses
    Poco más de lo mismo
version 12                  2019        + 6 meses
version 13                  2019        + 6 meses
version 14                  2020        + 6 meses
version 15                  2020        + 6 meses
version 16                  2021        + 6 meses
version 17                  2021        + 6 meses
version 18                  2022        + 6 meses
version 19                  2022        + 6 meses
version 20                  2023        + 6 meses


Los grandes beneficiados de la situación con JAVA fueron: C# y JS

Python ha crecido muchísimo, con gente no experta en desarrollo, que no necesitan montar apps complejas...
más bien scripts sencillos... y python es ideal para eso:
    - Matemáticos / estadísticos: Ingería de datos.
    - Testers: Automatización de pruebas
    - Administradores de sistemas: Autom. tareas tipicas de administración de sistemas.

En 11 años, 3 versiones de JAVA... 

## Sun microsystems

Era famosa por su HARDWARE !
Hacían una máquinas (servidores) brutales, con su propia arquitectura de microprocesador: SPARC 
Su propio SO, un SO certificado UNIX®, SOLARIS

Era una empresa bastante querida (se la miraba con buenos ojos) en el mundo del desarrollo de software.
Todo lo hacía Opensource, y solía ofrecer versiones gratuitas de todos sus productos de pago.

### OpenOffice > StarOffice

## Oracle

Es una empresa con una gran BBDD, la mejor BBDD Relacional que hay.
Pero con ver su historial, nos damos cuenta que el resto de cosas que han tocado... se las han ido cargando:

### MySQL --------> MariaDB

### OpenOffice ---> LibreOffice

### Hudson -------> Jenkins 

---

# SonarQube

Es un analizado de CALIDAD DE CODIGO

---
En Java manejamos:
- Modulo                module
    - Paquetes          package
        - Clases        class
        - Interfaces    interface

module {
    exports
    uses
    requires
    provides
}

---

# CAGADAS EN LA SINTAXIS DE JAVA

## Uso de los null

Me evita el tener claro cómo debo hablar con una función.
Se resuelve en JAVA 1.8:
- Clase Optional: Evita el uso de null al devolver un valor.
    Desde JAVA 1.8 esta considerado una MUY MUY MUY MUY FATALMENTE HORRIBLE practica que una función devuelva null en algñun escenario.
    ESO HAY QUE EVITARLO A TODA COSTA.

## Getters y Setters de Java

Me venden que sirven para encapsular datos de un objeto. Y controlar el acceso a esos datos.
Es básico.... los setter y los getter? NO... es básico encapsular!!!
Pero vaya mierda de forma de encapsular que tiene JAVA: getter y los setter.

```java

public class Rectangulo {
    
    public int base;
    public int altura;
    
    public rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altuta;
    }
    
    public int superficie(){
        return base*altura;
    }
    public int perimetro(){
        return 2*base+2*altura;
    }
    
}
// ^^ Le hago el día 1
// Del día 2 al 100 otros escriben cosas como: 

....

// Hago uso de esa clase:

Rectangulo r1 = new Rectangulo(10,5);
System.out.println(r1.base);
System.out.println(r1.superficie());
r1.altura=10;
System.out.println(r1.altura);
System.out.println(r1.superficie());

// Funciona? GENIAL !
// En cambio, me dirían: ESO ES UNA MUY MALA PRACTICA.                          VERDAD
// Tienes que encapsular.                                                       MENTIRA !
    // Si el día de maána necesito encapsular (que no se si lo necesitaré) como no haya montado getter y setter, 
    // Me crujen... O mejor dicho: CRUJO YO EL CODIGO DE UN HUEVO DE PEÑA que hayan estado usando mi clase
    // Y para evitarlo, desde el día 0, nos recomiendan montar los getter y los setter... por si acaso!
// No quiero encapsular... Quiero que los datos sean accesibles. Es mi requerimiento
// Te faltan los getter y los setter.                                           VERDAD                  

// El día 101 y quiero añadir un control sobre la base... No puede ser menor que 0

```


```java

public class Rectangulo {
    
    private int base;
    private int altura;
    
    public rectangulo(int base, int altura) {
        setBase(base);
        this.altura=altuta;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    public void setBase(int base){
        if (base<0 ) throw new RuntimeException("La base debe ser mayor o igual a cero");
        this.base=base;
    }
    
    public void setAltura( int altura){
        this.altura=altura;
    }
    
    public int superficie(){
        return base*altura;
    }
    public int perimetro(){
        return 2*base+2*altura;
    }
    
}

....

// Hago uso de esa clase:

Rectangulo r1 = new Rectangulo(10,5);
System.out.println(r1.getBase());
System.out.println(r1.superficie());
r1.setAltura(10);
System.out.println(r1.getAltura());
System.out.println(r1.superficie());

// Funciona? GENIAL !
// Y, me dirían: ESO ES UNA MUY BUENA PRACTICA.                                 VERDAD
// Porque has encapsulado.                                                      MENTIRA !


```
Los getter y setter no son para encapsular... son para facilitar el mnto y controlar los cambios requeridos en código
cuando necesite encapsular... si acaso me hace falta !

@Getter @Setter
private int numero;

## El operador diamante ... está en el lado contrario! En serio ????

## Todo codigo debe estar en una clase. En serío????

Parte de esto se resuelve en Java 1.8... al permitir meter código en interfaces
- Se añaden las funciones publicas estáticas en interfaces <<  CHAPUZA !
    - Me dejan funciones publicas pero no privadas??? en serio ???
        - Y si tengo 2 publicas que comparten código... no puedo meter ese código en una privada? NO!
        - Y si tengo una publica muy grande y quiero repartr ese código en 3 funciones : NOP !
        < ESTO SE AÑADE en JAVA 1.9: La posibilidad de añadir funcioens estáticas privadas en interfaces
- Se añaden las funciones default en interfaces.
    Esto SOLO debe usarse para poner como código: throw new RuntimeException("Not implemented");

SuministradorDeDiccionariosFactory.getSuministrador();

public interface SuministradorDeDiccionariosFactory {
    public static SuministradorDeDiccionarios getSuministrador(){
        return new SuministradorDeDiccionariosDesdeFicheros();
    }
    
}

## Modificadores de privacidad en las clases y funciones de JAVA:
    
                    Mismo archivo           Mismo paquete       Heredadas       Otros paquetes
public                  √                       √                   √               √
protected               √                       √                   √               x
no poner nada           √                       √                   x               x
private                 √                       x                   x               x

Son pocos? muchos? suficientes? No son suficientes!
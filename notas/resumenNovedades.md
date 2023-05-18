# Novedades / Hitos en JAVA

## Java 1.5

- Iterable
- Anotaciones

## Java 1.8

- Soporte a la programación funcional:
    - Paquete java.util.fuction (Funcion, Consumer, Predicate, Supplier...)
    - Nuevos operadores:
        - :: Que permite referenciar una función
        - -> Que permite definir funciones anónimas como expresiones (lambda)
    - Paquete java.util.stream, para aplicar programación MapReduce en Java sobre colecciones
-  Posibilidad de crear funciones PUBLICAS estáticas en interfaces
-  Posibilidad de crear funciones default estáticas en interfaces -> Facilitar los mntos
-  Optional para evitar devolver null
-  Un nuevo API para la gestión de fechas:
    -  Antiguamente:
            - Date (millis)
            - Calendar (GregorianCalendar)
            - java.sql.Date
    - Basado en la antigualibreria Java-joda-time
        - LocalDate
        - LocalDateTime
        - ZonedDateTime
        - Instant (que sirve de puente entre los apis antiguos y el nuevo)
- La capacidad de anotar los argumentos de una función
    public void generarInforme( @NotNull String titulo );

## Java 9

- Modulos: Agrupaciñon de paquetes
    - module-info.java
        - Definir dependencias entre modulos
        - Exportaciones de un modulos
        - Implementaciones de Interfaces que un modulo ofrece
- Inyección de dependencias ServiceLoader
- Posibilidad de crear funciones estáticas PRIVADAS en interfaces
- Funciones .of de todas las interfaces de colecciones de java (Colecciones inmutables)
    List.of(1,2,3)   
- JShell

## Java 10

- Uso de la palabra var para hacer inferencia de tipos en variables
    - var lista = List.of(1,2,3)
- Funciones .copyOf de todas las interfaces de colecciones de java (Colecciones inmutables)
- Optional: .orElseThrow()

## Java 11

- Posibilidad de ejecutar ficheros .java directamente desde la máquina virtual
- La posibilidad de usar var en los argumentos de las expresiones lambda:
    (@NonNull Integer numero) -> numero * 2    
    (@NonNull var listaDeTipoMuyComplejo) -> numero * 2    
    (@NonNull numero) -> numero * 2 // ERROR
- Funciones para leer y escribir archivos en Files: writeString readString
- Cambios leves en String
    - .isBlank()
    - .lines() -> stream
- API de peticiones HTTP sufre un rediseño: Contructores sigan un patrón builder()
    - HttpRequest request = HttpRequest.newBuilder()
                                        .POST()     
                                        .uri("http://miservidor.com/ruta")
                                        .header("clave", "valor")
                                        .build();
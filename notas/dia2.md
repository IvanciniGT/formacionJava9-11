# Casos de uso de la programación funcional:

- Implementar un patron listener
    
    clase ClaseQueHaceCosas       interfaz ListenerDeLaClaseQueHaceCosas
                                        notify(EventoDeLaClaseQueHaceCosas evento)
                                        
    instancia = new ClaseQueHaceCosas();
    intancia.registerListener( algiuenQueImplementeListenerDeLaClaseQueHaceCosas)
    
    Cuando se haga alguna operación en la instancia
    
    el Listener recibe una notificación

    Vaya aventura!!!
    
    
    class ClaseQueHaceCosas{
        
        public void registerListener (Consumer<Eventos> consumer)
        
    }
    
    intancia.registerListener( (evento)-> System.out.println(evento) );

- Programación asincrona: Funciones de Callback

    Llamo a una función que se ejecuta en su propio hilo... y me desentiendo
    
    ...
    // Quiero que cuando acabe el informe se llame a mi funcion X
    generaInforme(this::X); // Esto abre su propio hilo donde ejecutarse
    // En paralelo a esa generación de informe, sigo haciendo otras cosas...
    
    
    public void X(){
        .. Más cosas
    }
    ...
    
- MapReduce

En java 1.8, añaden el paquete java.util.stream.Stream

Stream es una coleccion de datos (secuencia), como si fuera un List
solo que tiene funciones para programación funcional.

Puedo pasar de cualquier Collection de Java a un Stream, al aplicarle la funcion .stream()
Puedo pasar de un Stream a un Collection a través de la función .collect

Stream1         -> map( f )     ->  Stream2
 dato1                              f(dato1)
 dato2                              f(dato2)
 dato3                              f(dato3)
 
 
 
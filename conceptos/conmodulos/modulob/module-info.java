module modulob {
    
    exports es.curso.paqueteb;
    //exports es.curso.paqueteb.impl;
    
    provides es.curso.paqueteb.Interfaz
        with es.curso.paqueteb.impl.Clase1QueImplementaInterfaz,
             es.curso.paqueteb.impl.Clase2QueImplementaInterfaz;
    
}
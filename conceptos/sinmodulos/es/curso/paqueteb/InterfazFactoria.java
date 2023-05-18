package es.curso.paqueteb;

import es.curso.paqueteb.impl.Clase1QueImplementaInterfaz;
import es.curso.paqueteb.impl.Clase2QueImplementaInterfaz;

public interface InterfazFactoria {
    
    static Interfaz dameInstanciaDeUnTipo(){
        return new Clase1QueImplementaInterfaz();
    }
    static Interfaz dameInstanciaDeOtroTipo(){
        return new Clase2QueImplementaInterfaz();
    }
    
}

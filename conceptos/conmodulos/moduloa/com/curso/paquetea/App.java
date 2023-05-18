package com.curso.paquetea;

import es.curso.paqueteb.Interfaz;
import java.util.ServiceLoader;
//import es.curso.paqueteb.InterfazFactoria;

//import es.curso.paqueteb.impl.Clase1QueImplementaInterfaz;
//import es.curso.paqueteb.impl.Clase2QueImplementaInterfaz;

// A mi me debería dar igual quien implemente la interfaz... 
//  Me debe bastar con que el objeto que me pasen cumpla con la interfaz... y por ende
// tenga el metodo dameTexto, que es el que necesito!
// En este caso, me estoy pasando por las narices el Ppo de Inversión de Dependencias
public class App {
    
    public static void main(String[] args) {
        
                                        // Inyección de dependencias J1.9
        Iterable<Interfaz> interfaces = ServiceLoader.load(Interfaz.class);
                                        // Esto busca en el module path
                                        // En todos los modulos
                                        // las implemntaciones que hay de esa interfaz
                                        
                                        // Crea una instancia de cada una y la devuelve.
                                        // Pero adicionalmente esa instancia es cacheada
                                        // Si se vuelve a pedir una instancia de esa interfaz
                                        // Se devuelven las anteriores
                                        // ESTO TRABAJA COMO UN SINGLETON
        //Interfaz i1 = InterfazFactoria.dameInstanciaDeUnTipo() ;
        //System.out.println(i1.dameTexto());

        //Interfaz i2 = InterfazFactoria.dameInstanciaDeOtroTipo();
        for (Interfaz interfaz : interfaces)
            System.out.println(interfaz.dameTexto());
        
//        Interfaz i3 = new Clase1QueImplementaInterfaz() ;
//        System.out.println(i3.dameTexto());

//        Interfaz i4 = new Clase2QueImplementaInterfaz() ;
//        System.out.println(i4.dameTexto());
        
    }
    
}
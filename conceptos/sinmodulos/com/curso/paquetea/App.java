package com.curso.paquetea;

import es.curso.paqueteb.Interfaz;
import es.curso.paqueteb.InterfazFactoria;

import es.curso.paqueteb.impl.Clase1QueImplementaInterfaz;
import es.curso.paqueteb.impl.Clase2QueImplementaInterfaz;

// A mi me debería dar igual quien implemente la interfaz... 
//  Me debe bastar con que el objeto que me pasen cumpla con la interfaz... y por ende
// tenga el metodo dameTexto, que es el que necesito!
// En este caso, me estoy pasando por las narices el Ppo de Inversión de Dependencias
public class App {
    
    public static void main(String[] args) {
        
        Interfaz i1 = InterfazFactoria.dameInstanciaDeUnTipo() ;
        System.out.println(i1.dameTexto());

        Interfaz i2 = InterfazFactoria.dameInstanciaDeOtroTipo();
        System.out.println(i2.dameTexto());
        
        Interfaz i3 = new Clase1QueImplementaInterfaz() ;
        System.out.println(i3.dameTexto());

        Interfaz i4 = new Clase2QueImplementaInterfaz() ;
        System.out.println(i4.dameTexto());
        
    }
    
}
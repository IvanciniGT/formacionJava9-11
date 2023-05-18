import java.util.function.*;
// Programación funcional: (Se introduce en Java 1.8)
//
// Cuando el lenguaje me permite que una variable referencia a una función!
// Desde el momento que podemos hacer esto:
// - Podemos crear funciones que reciban como argumentos otras funciones
// - Podemos crear funciones que devuelvan otras funciones
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args ){

        System.out.println( doblar( 5 ) ); //La función doblar se ejecuta desde main

        String  texto   =   "hola";
        int     numero  =   7;               // Permite referenciar una función
        Function<Integer, Integer> funcion = App::doblar ;
                // Recibe // Devuelve
        
        System.out.println( texto );
        System.out.println( numero );
        System.out.println( funcion );
        
        imprimirResultado(funcion, 20);         // Paso a imprimir resultado la función doblar
        imprimirResultado( App::doblar , 20);   // Es dentro de imprimir Resultado desde donde ejecuto doblar
        App miApp = new App();
        imprimirResultado( miApp::triple , 20);   // Es dentro de imprimir Resultado desde donde ejecuto doblar
        
        // Expresión: Es una porción de código que devuelve un valor
        // int numero = 5 + 3;  // Statement
                        /////      Expression
        // Expresiones lambda: Es una expresión, que devuelve una función creada en la expresión, una función sin nombre.
        //                      En estas expresiones podemos usar inferencia de tipos
        Function<Integer, Integer> funcion2 = (Integer numero2)->{
                                                                return numero2 * 4;
                                                            } ;
        Function<Integer, Integer> funcion3 = (numero2)->{
                                                                return numero2 * 4;
                                                            } ;
        Function<Integer, Integer> funcion4 = numero2->{
                                                                return numero2 * 4;
                                                            } ;
        Function<Integer, Integer> funcion5 = numero2-> numero2 * 4;
        
        imprimirResultado(funcion5, 20);
        
        imprimirResultado(num -> num / 5, 25);
        
        //
        // ME creo una lista en Java, con los numeros 1,2 3
                        //lista = [1,2,3]
        List<Integer> miLista2 = new ArrayList<Integer>();
        //List<Integer> miLista = new ArrayList<>();
        var miLista = new ArrayList<Integer>();
        //List<> miLista = new ArrayList<Integer>(); // Esto no funciona!
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        
        List<String> miLista3=Arrays.asList("texto1", "Texto2", "TEXTO3");
        
        var miListaTextos=List.of("texto1", "Texto2", "TEXTO3"); // 1.9 se añaden los metodos .of en las interfaces de Collections
        // Pre Java 1.5
        for(int i =0;i<miLista.size(); i++){
            System.out.println(miListaTextos.get(i));
        }
        // Pre Java 1,8
        for(String unTexto : miListaTextos){
            System.out.println(unTexto);
        }
        // Post JAVA 1.8        // La función que quiero aplciar sobre cada item
        miListaTextos.forEach( System.out::println );   // Más eficiente y más cómodo
        
        // En este momento ya no tengo un List<String>, sino un Stream<String>
        var miListaNueva = miListaTextos.parallelStream()   // para cada texto
                     .map(      txt -> txt.toUpperCase() )  // Lo transforma a mayusculas
                     .filter(   txt -> txt.endsWith("2") )   // Me quedo con los que acaban en 2
                     //.forEach( System.out::println );     
                     .collect(  Collectors.toList() );      // Lo convierto a un List<String>
                     
        miListaNueva.forEach( System.out::println );   // Más eficiente y más cómodo

    }
    
    public static void imprimirResultado(Function<Integer, Integer> funcion , int numero){
        System.out.println( funcion.apply( numero ) );
    }
    
    public static int doblar(int numero){
        return numero * 2;
    }
    public int triple(int numero){
        return numero * 3;
    }
}
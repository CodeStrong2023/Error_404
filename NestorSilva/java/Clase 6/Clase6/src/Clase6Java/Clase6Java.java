/*
 Proyecto caja: Crear un proyecto según las especificaciones
mostradas a continuación.
La formula es: Volumeb = ancho * alto * profundidad
*/
package Clase6Java;


public class Clase6Java {
    public static void main(String argd[]) { //Método main
        //variables locales
        int medidaAncho = 3; //Valores ingresados en código duro
        int medidaAlto = 2;
        int medidaProf = 6;
        
        Clase6Caja caja1 = new Clase6Caja (); //Instanciamos el objeto, constructor vacío
        caja1.ancho = medidaAncho; //Le pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen ();//Llamamos al método }
        //Primer resultado
        System.out.println ("resultado volumen caja 1: "+ resultado);
        
        Clase6Caja caja2 = new Clase6Caja(2,4,6); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al método para un nuevo cálculo
        System.out.println ("resultado volumen de caja 2: " + caja2.calcularVolumen());
    }    
    
}

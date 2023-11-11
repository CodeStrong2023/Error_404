
package Clase6Java; //Package

public class Clase6Caja { //Clase publica caja
    //Atributos (características)
    int ancho;
    int alto;
    int profundo;
    //Métodos y constructores (acciones)
    public Clase6Caja () { //Constructor 1 = vacio
        
    }
    //Constructor de parámetros 
    public Clase6Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen () { //Método para calcular
        return ancho * alto * profundo;
    }
}

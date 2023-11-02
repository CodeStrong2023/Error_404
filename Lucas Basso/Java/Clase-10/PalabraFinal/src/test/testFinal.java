/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
variables: Evita cambiar el valor que almacena la variable
    métodos: Evitda que se modifique la definicion o el comportamiento de un
    método desde una subclase(hija)
    Clases:  Evita que se creen clases hijas
    Otras caracteristicas es que normalmente, cuando trabajamos con variables
    se combina con el modificador de acceso estático para convertir una variavle en una constante, 
    es decir que no se puede modificar su varo,
    el ejemplo de esto es la clase math en la cual todos sus atributas
    son de tipo static y final, es por esto que la cariable pi* se conoce como una constante.
*/
package test;

import domain.Persona;

public class testFinal {
    public static void main(String[] args) {
      final int miDni = 42619189;
        System.out.println("miDni = " + miDni);
        //miDni = 20312321; No se puede modificar
        //Persona.CONSTANTE_AQUI = 9; // no se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Lucas Basso");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Lara");
        System.out.println("Personal nombre: " + persona1.getNombre());
    }
    
}

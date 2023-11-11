/*
 Ejercicio 10: Pedir 10 nros y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
 */
package clase6;

 import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
              int numero, suma = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            suma += numero;
        }
   
        JOptionPane.showMessageDialog(null, "\nLa suma de todos los números es: "+suma);
    }
    
}



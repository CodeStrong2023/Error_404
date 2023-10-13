/*
Ejercicio 4: Pedir números hastaque se teclee uno negativo, y mostrar cuantos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package ejerciciociclo04;

import javax.swing.JOptionPane;



public class ciclo04 {
      public static void main(String[] args) {

        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero >= 0){
            JOptionPane.showMessageDialog(null,"El número "+numero+" es positivo");
        
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número")); 
        }
        JOptionPane.showMessageDialog(null,"A ingresado "+conteo+" números que no son negativos");

      }
}

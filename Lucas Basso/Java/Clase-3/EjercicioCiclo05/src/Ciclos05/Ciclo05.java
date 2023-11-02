
package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclo05 {
    public static void main(String[] args) {
         int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //Esto genera un número aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(numero < aleatorio) {
                JOptionPane.showMessageDialog(null,"Digite un número mayor");
            }
            else if (numero > aleatorio){
                JOptionPane.showMessageDialog(null,"Digite un número menor");
            }
            else{
                JOptionPane.showMessageDialog(null,"\tFelicidades, 👍 🎇 ADIVINASTE EL NÚMERO 🎇 ");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null,"Adivinaste el numero en "+conteo+" intentos");
    }
    
}

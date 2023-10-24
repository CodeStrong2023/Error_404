package operaciones;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,suma = 0;
        do{        
            System.out.println("Ingrese números ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        }while(numero != 0);
        System.out.print("\nLa suma de tofos los numeros ingresados es: "+suma);
    }
}
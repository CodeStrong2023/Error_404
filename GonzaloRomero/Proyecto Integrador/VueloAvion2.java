import java.util.Scanner;

public class VueloAvion2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op, cantidadPasajes = 0, contador, edad;
        double descuento, totalPagar = 0, seguroVuelo, costoPasaje, costoDescuento;
        String nombreCompleto;
        int numDestino, Miami, Brasil,BuenosAires = 0, Time;
        int Error;
        int[][] asiento = new int[4][25];
        String[] PasajerosDNI = new String[100];
        String[] PasajerosNombre = new String[100];
        int[] ContadorGuardar = new int[3];
        int x, i, j, fila;
        char a, PasajerosNombreChar, DNIChar, PasajerosDNIChar;
        int columna, ContadorReservarAsiento, GuardarDNI, GuardarNombre, LongitudDNI, ContadorGuardarInt, t;

        System.out.println(" ");
        ContadorGuardar[1] = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 25; j++) {
                asiento[i][j] = 0;
            }
        }

        for (j = 0; j < 100; j++) {
            PasajerosDNI[j] = "0";
            PasajerosNombre[j] = "0";
        }

        op = 0;
        System.out.println("/////////////////BIENVENIDOS A AEROL�NEAS UTN//////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////SELECCIONE UNA OPCI�N////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////");

        while (op != 5) {
            System.out.println(" 1- Reservar pasaje");
            System.out.println(" 2- Reservar asiento");
            System.out.println(" 3- Cancelar asiento");
            System.out.println(" 4- Mostrar asientos");
            System.out.println(" 5- Salir");
            System.out.println(" ");
            System.out.print("Ingrese la opci�n que desea hacer: ");
            op = scanner.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("La opcion no puede ser menor a 1 ni mayor que 5. Ingrese solo entre 1 y 5.");
            } else {

                switch (op) {
                    case 1 -> {
                        System.out.println("Bienvenido a Aerol�neas UTN.");
                        System.out.println("AVISO IMPORTANTE");
                        System.out.println("Si uno de los pasajeros es menor de 5 a�os, contamos con un descuento del 100%, pero debe abonar un seguro de viaje de $3000");
                        System.out.println("Si es mayor de 65 a�os obtendr� un 50% de descuento del valor total del pasaje");
                        System.out.println("En caso de no entrar en estos descuentos, se le aplicar� el descuento seg�n su destino");
                        System.out.println("Estamos trabajando por el momento con 2 opciones de vuelo. Responder con (1 o 2)");
                        System.out.println("1_ Destino a: Brasil con un 15% de descuento");
                        System.out.println("2_ Destino a: Miami con un 10% de descuento");
                        System.out.println("3_ Destino a: Buenos Aires con un 25% de descuento");

                        numDestino = scanner.nextInt();

                        while (numDestino < 1 || numDestino >= 4) {
                            System.out.println("Estamos trabajando por el momento con 3 opciones de vuelo. Responder con (1, 2 o 3)");
                            System.out.println("1- Destino a: Brasil con un 15% de descuento, 2- Destino a: Miami con un 10%, 3- Destina a: Buenos Aires con un 25%");
                            numDestino = scanner.nextInt();
                        }

                         Miami = 135370;
                         Brasil = 119499;
                         BuenosAires = 20883;
                       
                        switch (numDestino) {
                            case 1 -> {
                                System.out.println("Destino a Brasil = $119.499 ");
                                System.out.println("Tiempo de vuelo estimado 6h 24m.");
                                System.out.print("Ingrese la cantidad de pasajes (m�ximo 5): ");
                                cantidadPasajes = scanner.nextInt();
                                if (cantidadPasajes > 5) {
                                    System.out.println("Error: La cantidad de pasajes ingresada supera el l�mite permitido.");
                                } else {
                                    contador = 1;
                                    totalPagar = 0;

                                    while (contador <= cantidadPasajes) {
                                        System.out.print("Ingrese el nombre completo del pasajero " + contador + ": ");
                                        nombreCompleto = scanner.nextLine();
                                        ContadorGuardar[1]++;
                                        System.out.print("Ingrese el documento del pasajero " + contador + ": ");
                                        String DNI = scanner.nextLine();
                                        LongitudDNI = DNI.length();
                                        while (LongitudDNI != 8) {
                                            System.out.print("Vuelve a ingresar correctamente el documento del pasajero, aseg�rese de que sean 8 d�gitos. " + contador + ": ");
                                            DNI = scanner.nextLine();
                                            LongitudDNI = DNI.length();
                                        }

                                        GuardarDNI = 0;
                                        GuardarNombre = 0;

                                        if (PasajerosNombre[ContadorGuardar[1]].equals("0")) {
                                            PasajerosNombre[ContadorGuardar[1]] = nombreCompleto;
                                        }

                                        System.out.println("El pasajero, " + PasajerosNombre[ContadorGuardar[1]]);

                                        if (PasajerosDNI[ContadorGuardar[1]].equals("0")) {
                                            PasajerosDNI[ContadorGuardar[1]] = DNI;
                                        }

                                        System.out.println(" con el documento: " + PasajerosDNI[ContadorGuardar[1]]);

                                        System.out.print("Ingrese la edad del pasajero " + contador + ": ");
                                        edad = scanner.nextInt();

                                        if (edad <= 5) {
                                            descuento = 100;
                                            seguroVuelo = 3000;
                                        } else {
                                            if (edad >= 65) {
                                                descuento = 50;
                                            } else {
                                                descuento = 15;
                                            }
                                            seguroVuelo = 0;
                                        }

                                        costoDescuento = Brasil - (Brasil * descuento / 100);
                                        totalPagar = totalPagar + seguroVuelo + costoDescuento;

                                        System.out.println("El pasajero " + nombreCompleto + " tiene un descuento del " + descuento + "%");
                                        System.out.println("valor pasaje: $" + (costoDescuento + seguroVuelo));

                                        contador++;
                                        GuardarDNI++;
                                        GuardarNombre++;
                                    }

                                    System.out.println("Nuestros horarios disponibles son: ");
                                    System.out.println("1_ 5:30hs");
                                    System.out.println("2_ 13:10hs");
                                    System.out.println("3_ 15:30hs");
                                    System.out.print("Responder con (1,2 o 3): ");
                                    Time = scanner.nextInt();

                                    switch (Time) {
                                        case 1:
                                            System.out.println("Su viaje a las 5:30hs con destino a Brasil, sale el pr�ximo Lunes 18/12/2023");
                                            break;
                                        case 2:
                                            System.out.println("Su viaje a las 13:10hs con destino a Brasil, sale el pr�ximo Lunes 18/12/2023");
                                            break;
                                        case 3:
                                            System.out.println("Su viaje a las 15:30hs con destino a Brasil, sale el pr�ximo Lunes 18/12/2023");
                                            break;
                                        default:
                                            System.out.println("Las opciones eran (1,2 o 3)");
                                    }

                                    System.out.println("El total a pagar es: $" + totalPagar);

                                    for (t = 1; t <= 99; t++) {
                                        if (!PasajerosNombre[t].equals("0") && !PasajerosDNI[t].equals("0")) {
                                            System.out.println("El pasajero, " + PasajerosNombre[t] + " con el documento: " + PasajerosDNI[t]);
                                        }
                                    }
                                }
                            }
                            
                            case 2 -> {
                                System.out.println("Destino a Miami = $135.370 ");
                                System.out.println("Tiempo de vuelo estimado 9h 17m.");
                                System.out.print("Ingrese la cantidad de pasajes (m�ximo 5): ");
                                cantidadPasajes = scanner.nextInt();

                                if (cantidadPasajes > 5) {
                                    System.out.println("Error: La cantidad de pasajes ingresada supera el l�mite permitido.");
                                } else {
                                    contador = 1;
                                    totalPagar = 0;

                                    while (contador <= cantidadPasajes) {
                                        System.out.print("Ingrese el nombre completo del pasajero " + contador + ": ");
                                        nombreCompleto = scanner.nextLine();
                                        ContadorGuardar[1]++;
                                        System.out.print("Ingrese el documento del pasajero " + contador + ": ");
                                        String DNI = scanner.next();
                                        LongitudDNI = DNI.length();

                                        while (LongitudDNI != 8) {
                                            System.out.print("Vuelve a ingresar correctamente el documento del pasajero, aseg�rese de que sean 8 d�gitos. " + contador + ": ");
                                            DNI = scanner.next();
                                            LongitudDNI = DNI.length();
                                        }

                                        GuardarDNI = 0;
                                        GuardarNombre = 0;

                                        if (PasajerosNombre[ContadorGuardar[1]].equals("0")) {
                                            PasajerosNombre[ContadorGuardar[1]] = nombreCompleto;
                                        }

                                        System.out.println("El pasajero, " + PasajerosNombre[ContadorGuardar[1]]);

                                        if (PasajerosDNI[ContadorGuardar[1]].equals("0")) {
                                            PasajerosDNI[ContadorGuardar[1]] = DNI;
                                        }

                                        System.out.println(" con el documento: " + PasajerosDNI[ContadorGuardar[1]]);

                                        System.out.print("Ingrese la edad del pasajero " + contador + ": ");
                                        edad = scanner.nextInt();

                                        if (edad <= 5) {
                                            descuento = 100;
                                            seguroVuelo = 3000;
                                        } else {
                                            if (edad >= 65) {
                                                descuento = 50;
                                            } else {
                                                descuento = 10;
                                            }
                                            seguroVuelo = 0;
                                        }

                                        costoDescuento = Miami - (Miami * descuento / 100);
                                        totalPagar = totalPagar + seguroVuelo + costoDescuento;

                                        System.out.println("El pasajero " + nombreCompleto + " tiene un descuento del " + descuento + "%");
                                        System.out.println("valor pasaje: $" + (costoDescuento + seguroVuelo));

                                        contador++;
                                        GuardarDNI++;
                                        GuardarNombre++;
                                    }

                                    System.out.println("Nuestros horarios disponibles son: ");
                                    System.out.println("1_ 5:30hs");
                                    System.out.println("2_ 13:10hs");
                                    System.out.println("3_ 15:30hs");
                                    System.out.print("Responder con (1,2 o 3): ");
                                    Time = scanner.nextInt();

                                    switch (Time) {
                                        case 1 -> System.out.println("Su viaje a las 5:30hs con destino a Miami, sale el pr�ximo Lunes 18/12/2023");
                                        case 2 -> System.out.println("Su viaje a las 13:10hs con destino a Miami, sale el pr�ximo Lunes 18/12/2023");
                                        case 3 -> System.out.println("Su viaje a las 15:30hs con destino a Miami, sale el pr�ximo Lunes 18/12/2023");
                                        default -> System.out.println("Las opciones eran (1,2 o 3)");
                                    }

                                    System.out.println("El total a pagar es: $" + totalPagar);
                                }
                            }
                        }
                        }

                            case 3 -> {
                                System.out.println("Destino a Buenos Aires = $20883 ");
                                System.out.println("Tiempo de vuelo estimado 1h 35m.");
                                System.out.print("Ingrese la cantidad de pasajes (maximo 5): ");
                                cantidadPasajes = scanner.nextInt();


                                if (cantidadPasajes > 5) {
                                    System.out.println("Error: La cantidad de pasajes ingresada supera el l�mite permitido.");
                                } else {
                                    contador = 1;
                                    totalPagar = 0;

                                    while (contador <= cantidadPasajes) {
                                        System.out.print("Ingrese el nombre completo del pasajero " + contador + ": ");
                                        nombreCompleto = scanner.nextLine();
                                        ContadorGuardar[1]++;
                                        System.out.print("Ingrese el documento del pasajero " + contador + ": ");
                                        String DNI = scanner.next();
                                        LongitudDNI = DNI.length();

                                        while (LongitudDNI != 8) {
                                            System.out.print("Vuelve a ingresar correctamente el documento del pasajero, aseg�rese de que sean 8 d�gitos. " + contador + ": ");
                                            DNI = scanner.next();
                                            LongitudDNI = DNI.length();
                                        }

                                        GuardarDNI = 0;
                                        GuardarNombre = 0;

                                        if (PasajerosNombre[ContadorGuardar[1]].equals("0")) {
                                            PasajerosNombre[ContadorGuardar[1]] = nombreCompleto;
                                        }

                                        System.out.println("El pasajero, " + PasajerosNombre[ContadorGuardar[1]]);

                                        if (PasajerosDNI[ContadorGuardar[1]].equals("0")) {
                                            PasajerosDNI[ContadorGuardar[1]] = DNI;
                                        }

                                        System.out.println(" con el documento: " + PasajerosDNI[ContadorGuardar[1]]);

                                        System.out.print("Ingrese la edad del pasajero " + contador + ": ");
                                        edad = scanner.nextInt();

                                        if (edad <= 5) {
                                            descuento = 100;
                                            seguroVuelo = 3000;
                                        } else {
                                            if (edad >= 65) {
                                                descuento = 50;
                                            } else {
                                                descuento = 10;
                                            }
                                            seguroVuelo = 0;
                                        }

                                        costoDescuento = BuenosAires - (BuenosAires * descuento / 100);
                                        totalPagar = totalPagar + seguroVuelo + costoDescuento;

                                        System.out.println("El pasajero " + nombreCompleto + " tiene un descuento del " + descuento + "%");
                                        System.out.println("valor pasaje: $" + (costoDescuento + seguroVuelo));

                                        contador++;
                                        GuardarDNI++;
                                        GuardarNombre++;
                                    }

                                    System.out.println("Nuestros horarios disponibles son: ");
                                    System.out.println("1_ 5:30hs");
                                    System.out.println("2_ 13:10hs");
                                    System.out.println("3_ 15:30hs");
                                    System.out.print("Responder con (1,2 o 3): ");
                                    Time = scanner.nextInt();

                                    switch (Time) {
                                        case 1:
                                            System.out.println("Su viaje a las 5:30hs con destino a Buenos Aires, sale el pr�ximo Lunes 10/07/2023");
                                            break;
                                        case 2:
                                            System.out.println("Su viaje a las 13:10hs con destino a Buenos Aires, sale el pr�ximo Lunes 10/07/2023");
                                            break;
                                        case 3:
                                            System.out.println("Su viaje a las 15:30hs con destino a Buenos Aires, sale el pr�ximo Lunes 10/07/2023");
                                            break;
                                        default:
                                            System.out.println("Las opciones eran (1, 2 o 3)");
                                    }

                                        System.out.println("El total a pagar es: $" + totalPagar);
                                }
                            }
                        }
                        break;
      
                    case 2:
                        ContadorReservarAsiento = 0;

                        while (ContadorReservarAsiento != cantidadPasajes) {
                            ContadorReservarAsiento++;

                            System.out.println("Ingrese el n�mero de fila (1-4)");
                            fila = scanner.nextInt() - 1;

                            System.out.println("Ingrese el n�mero de columna (1-25)");
                            columna = scanner.nextInt() - 1;

                            if (fila >= 0 && fila < 4 && columna >= 0 && columna < 25) {
                                if (asiento[fila][columna] == 0) {
                                    asiento[fila][columna] = 1;
                                    System.out.println("/////////////////////////////////////");
                                    System.out.println(" ASIENTO RESERVADO EXITOSAMENTE");
                                    System.out.println(" ///////////////////////////////////");
                                } else {
                                    System.out.println("/////////////////////////////////////");
                                    System.out.println("       ASIENTO RESERVADO            ");
                                    System.out.println(" [POR FAVOR SELECCIONE OTRO]");
                                    System.out.println(" ///////////////////////////////////");
                                }
                            } else {
                                System.out.println("/////////////////////////////////////");
                                System.out.println("      INGRESE UNA FILA Y COLUMNA V�LIDAS     ");
                                System.out.println(" ///////////////////////////////////");
                                ContadorReservarAsiento--;
                            }
                        }
                        break;
                        }
                    case 3:
                        System.out.print("Ingrese el n�mero de fila (1-4): ");
                        fila = scanner.nextInt();
                        fila--;

                        System.out.print("Ingrese el n�mero de columna (1-25): ");
                        columna = scanner.nextInt();
                        columna--;

                        if (asiento[fila][columna] == 1) {
                            asiento[fila][columna] = 0;
                            System.out.println("////////////////////////////////////");
                            System.out.println(" ASIENTO CANCELADO EXITOSAMENTE");
                            System.out.println(" ///////////////////////////////////");
                        } else {
                            System.out.println("/////////////////////////////////////");
                            System.out.println("       ASIENTO CANCELADO            ");
                            System.out.println("[ POR FAVOR SELECCIONE OTRO]");
                            System.out.println(" ///////////////////////////////////");
                            System.out.println("");
                        }
                        break;
            }
                    case 4:
                        System.out.print(" ");

                        System.out.println(" ");

                        for (i = 0; i < 4; i++) {
                            System.out.print("Fila " + (i + 1) + ": ");
                            for (j = 0; j < 25; j++) {
                                System.out.print(asiento[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                    break;
            
                    case 5:
                        System.out.println("Su registro se ha cerrado y guardado exitosamente, su monto total a pagar es de: $" + totalPagar + " y sus lugares son: ");

                        System.out.print(" ");

                        System.out.println(" ");

                        for (i = 0; i < 4; i++) {
                            System.out.print("Fila " + (i + 1) + ": ");
                            for (j = 0; j < 25; j++) {
                                System.out.print(asiento[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        System.out.println("");
                        System.out.println(" ...   GRACIAS POR ELEGIR AEROL�NEAS UTN   ... ");
                        break;
           

                        default:
                    System.out.println(" ////////////////////////////////////////////////");
                    System.out.println(" //////////ERROR INGRESE UN DIGITO V�LIDO /////////");
                    System.out.println(" ////////////////////////////////////////////////");
                }
            }
        }
    }

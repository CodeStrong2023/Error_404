public class VueloAvion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op, cantidadPasajes, contador, edad;
        double descuento, totalPagar, seguroVuelo, costoPasaje, costoDescuento;
        String nombreCompleto;
        int numDestino, Miami, Brasil, BuenosAires, Time;
        int Error;
        int[][] asiento = new int[4][25];
        String[] PasajerosDNI = new String[100];
        String[] PasajerosNombre = new String[100];
        int[] ContadorGuardar = new int[3];
        int x, i, j, asiento, fila;
        char a, PasajerosNombre, DNI, PasajerosDNI;
        int columna, ContadorReservarAsiento, GuardarDNI, GuardarNombre, LongitudDNI, ContadorGuardar, t;

        System.out.println(" ");
        ContadorGuardar[0] = 0;

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
        System.out.println("/////////////////BIENVENIDOS A AEROLÍNEAS UTN//////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////SELECCIONE UNA OPCIÓN////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////");

        while (op != 5) {
            System.out.println(" 1- Reservar pasaje");
            System.out.println(" 2- Reservar asiento");
            System.out.println(" 3- Cancelar asiento");
            System.out.println(" 4- Mostrar asientos");
            System.out.println(" 5- Salir");
            System.out.println(" ");
            System.out.print("Ingrese la opción que desea hacer: ");
            op = input.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("La opción no puede ser menor a 1 y mayor a 5. Solo entre 1 y 5.");
            } else {
                switch (op) {
                    case 1:
                        System.out.println("Bienvenido a Aerolíneas UTN.");
                        System.out.println("AVISO IMPORTANTE");
                        System.out.println("Si uno de los pasajeros es menor de 5 años, contamos con un descuento del 100%, pero debe abonar un seguro de viaje de $3000");
                        System.out.println("Si es mayor de 65 años obtendrá un 50% de descuento del valor total del pasaje");
                        System.out.println("En caso de no entrar en estos descuentos, se le aplicará el descuento según su destino");
                        System.out.println("Estamos trabajando por el momento con 3 opciones de vuelo. Responda con (1, 2 o 3)");
                        System.out.println("1_ Destino a: Brasil con un 15% de descuento");
                        System.out.println("2_ Destino a: Miami con un 10% de descuento");
                        System.out.println("3_ Destino a: Buenos Aires 25% de descuento");

                        numDestino = input.nextInt();

                        while (numDestino <= 0 || numDestino >= 4) {
                            System.out.println("Estamos trabajando por el momento con 3 opciones de vuelo. Responder con (1, 2 o 3)");
                            System.out.println("1- Destino a: Brasil con un 15% de descuento, 2- Destino a: Miami con un 10%, 3- Destino a: Buenos Aires 25%");
                            numDestino = input.nextInt();
                        }

                        Miami = 135370;
                        Brasil = 119499;
                        BuenosAires = 20883;

                        switch (numDestino) {
                            case 1:
                                System.out.println("Destino a Brasil = $119.499 ");
                                System.out.println("Tiempo de vuelo estimado 6h 24m.");
                                System.out.print("Ingrese la cantidad de pasajes (máximo 5): ");
                                cantidadPasajes = input.nextInt();

                                if (cantidadPasajes > 5) {
                                    System.out.println("Error: La cantidad de pasajes ingresada supera el límite permitido.");
                                } else {
                                    contador = 1;
                                    totalPagar = 0;

                                    while (contador <= cantidadPasajes) {
                                        System.out.print("Ingrese el nombre completo del pasajero " + contador + ": ");
                                        nombreCompleto = input.next();
                                        ContadorGuardar[0]++;

                                        System.out.print("Ingrese el documento del pasajero " + contador + ": ");
                                        DNI = input.next();
                                        LongitudDNI = DNI.length();

                                        while (LongitudDNI != 8) {
                                            System.out.print("Vuelve a ingresar correctamente el documento del pasajero, asegúrese de que sean 8 dígitos. " + contador + ": ");
                                            DNI = input.next();
                                            LongitudDNI = DNI.length();
                                        }

                                        GuardarDNI = 0;
                                        GuardarNombre = 0;

                                        if (PasajerosNombre[ContadorGuardar[0]].equals("0")) {
                                            PasajerosNombre[ContadorGuardar[0]] = nombreCompleto;
                                        }

                                        System.out.println("El pasajero, " + PasajerosNombre[ContadorGuardar[0]]);

                                        if (PasajerosDNI[ContadorGuardar[0]].equals("0")) {
                                            PasajerosDNI[ContadorGuardar[0]] = DNI;
                                        }

                                        System.out.println("con el documento: " + PasajerosDNI[ContadorGuardar[0]]);

                                        System.out.print("Ingrese la edad del pasajero " + contador + ": ");
                                        edad = input.nextInt();

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
                                    System.out.print("Responder con (1, 2 o 3): ");
                                    Time = input.nextInt();

                                    switch (Time) {
                                        case 1:
                                            System.out.println("Su viaje a las 5:30hs con destino a Brasil, sale el próximo Lunes 10/07/2023");
                                            break;
                                        case 2:
                                            System.out.println("Su viaje a las 13:10hs con destino a Brasil, sale el próximo Lunes 10/07/2023");
                                            break;
                                        case 3:
                                            System.out.println("Su viaje a las 15:30hs con destino a Brasil, sale el próximo Lunes 10/07/2023");
                                            break;
                                        default:
                                            System.out.println("Las opciones eran (1, 2 o 3)");
                                    }

                                    System.out.println("El total a pagar es: $" + totalPagar);

                                    for (t = 0; t < 99; t++) {
                                        if (!PasajerosNombre[t].equals("0") && !PasajerosDNI[t].equals("0")) {
                                            System.out.println("El pasajero, " + PasajerosNombre[t] + " con el documento: " + PasajerosDNI[t]);
                                        }
                                    }
                                }
                                break;

                            case 2:
                                ContadorReservarAsiento = 0;
                                while (ContadorReservarAsiento != cantidadPasajes) {
                                    ContadorReservarAsiento++;

                                    System.out.print("Ingrese el número de fila (1-4): ");
                                    fila = input.nextInt();
                                    fila--;

                                    System.out.print("Ingrese el número de columna (1-25): ");
                                    columna = input.nextInt();
                                    columna--;

                                    if (asiento[fila][columna] == 0) {
                                        asiento[fila][columna] = 1;
                                        System.out.println("/////////////////////////////////////");
                                        System.out.println("ASIENTO RESERVADO EXITOSAMENTE");
                                        System.out.println("/////////////////////////////////////");
                                    } else {
                                        System.out.println("/////////////////////////////////////");
                                        System.out.println("ASIENTO RESERVADO");
                                        System.out.println("[POR FAVOR SELECCIONE OTRO]");
                                        System.out.println("/////////////////////////////////////");
                                    }
                                }
                                break;

                            case 3:
                                System.out.print("Ingrese el número de fila (1-4): ");
                                fila = input.nextInt();
                                fila--;

                                System.out.print("Ingrese el número de columna (1-25): ");
                                columna = input.nextInt();
                                columna--;

                                if (asiento[fila][columna] == 1) {
                                    asiento[fila][columna] = 0;
                                    System.out.println("////////////////////////////////////");
                                    System.out.println("ASIENTO CANCELADO EXITOSAMENTE");
                                    System.out.println("////////////////////////////////////");
                                } else {
                                    System.out.println("/////////////////////////////////////");
                                    System.out.println("ASIENTO CANCELADO");
                                    System.out.println("[POR FAVOR SELECCIONE OTRO]");
                                    System.out.println("/////////////////////////////////////");
                                }
                                break;

                            case 4:
                                System.out.println(" ");
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
                                System.out.println("Su registro se ha cerrado y guardado exitosamente, su monto total a pagar es de: " + totalPagar + " y sus lugares son: ");
                                System.out.println(" ");
                                for (i = 0; i < 4; i++) {
                                    System.out.print("Fila " + (i + 1) + ": ");
                                    for (j = 0; j < 25; j++) {
                                        System.out.print(asiento[i][j] + " ");
                                    }
                                    System.out.println(" ");
                                }
                                System.out.println(" ");
                                System.out.println("...   GRACIAS POR ELEGIR AEROLÍNEAS UTN   ... ");
                                break;
                            default:
                                System.out.println("///////////////////////////////////////////////////////////////////");
                                System.out.println("//////////////////ERROR INGRESE UN DÍGITO VÁLIDO////////////////////");
                                System.out.println("///////////////////////////////////////////////////////////////////");
                        }
                    }
                }
            }
        }

    @Override
    public String toString() {
        return "VueloAvion []";
    }
    }
}
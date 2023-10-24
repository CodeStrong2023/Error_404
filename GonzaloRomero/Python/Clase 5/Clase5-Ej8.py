"""
Ejercicio 8: Menú interactivo - Cajero automático
Hacer un programa que simule un cajero automático con un saldo inicial de $1000 y tendrá el siguiente menú de opciones:
1- Ingresar dinero en la cuenta
2- Retirar dinero de la cuenta
3- Mostrar dinero disponible
4- Salir

"""

Saldo = 1000

while True:
    print('')
    print('\t |·| Cajero |·|')
    print('Opciones para hacer')
    print('1. Ingresar dinero a la cuenta')
    print('2. Retirar dinero de la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    Opcion = int(input('Digite la opción que desea: '))
    print('')
    if Opcion == 1:
        IngresarSaldo = float(input('Cuanto dinero quiere ingresar: '))
        Saldo += IngresarSaldo
        print(f'El saldo que tiene en la cuenta es: ${Saldo}')
    elif Opcion == 2:
        print(f'El saldo disponible en la cuenta es: ${Saldo}')
        RetirarSaldo = int(input('Cuanto dinero desea retirar: '))
        if RetirarSaldo > Saldo:
            print('Saldo ingresado no disponible')
        else:
            Saldo -= RetirarSaldo
            print(f'Dinero disponible en la cuenta: ${Saldo}')
    elif Opcion == 3:
        print(f'El dinero disponible en la cuenta es: ${Saldo}')
    elif Opcion == 4:
        print('Gracias por utilizar el cajero automático')
        break
    else:
        print('La opción ingresada no es correcto')
        print('')




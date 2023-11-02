"""

Ejercicio 7: Juego adivina el número.
Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio entre 1 y 100, y luego ir pidiendo números indicando 'Es mayor' o 'Es menor' según corresponda.
El proceso termina cuando el usuario acierta y allí se debe mostrar el número de intentos.

"""

import random

print('\t |·| Juego adivina el número |·|')

NumAleatorio = random.randint(0, 100) # Tomara un número aleatorio entre 0 y 100
contador = 0
while True:
    Num = int(input('Digite un número'))
    contador += 1
    if Num > NumAleatorio:
        print('\t El número es menor')
    elif Num < NumAleatorio:
         print('\t El número es mayor')
    else:
        print(f'Ganaste! Adivinaste el número {NumAleatorio}')
        break #Rompemos el ciclo y bucle
print(f'\n Número de intentos: {contador}')

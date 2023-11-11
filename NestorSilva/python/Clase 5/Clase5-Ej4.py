"""
Ejercicio 4: Sumar números pares dentro de un rango.
Hacer un programa para sumar números pares dentro de un rango, por ejemplo:

                suma de números pares del 2 al 30
                suma = 240

"""

a = int(input("¿Desde que numero comenzara la suma?"))
b = int(input("¿Hasta que numero quiere llegar a sumar?"))

sumaNpares = 0

for i in range(a, b+1):
    if i % 2 == 0: # De esta manera verificamos si el numero es par o impar
        sumaNpares += i

print(f"\n La suma de números pares dentro del rango es: {sumaNpares}")


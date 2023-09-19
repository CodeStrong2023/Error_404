# ejercicio 1: iterar un rango de 0 a 10 e imporimir numeros divisibles entre 3
# ejemplo de ejecucion: 0,3,6,9
print('Rango de 0 a 10 con numeros divisibles entre 3')
for i in range(11):
    if i % 3 == 0:
        print(i)


# ejercicio 2: crear un rango de numeros de 2 a 6 e imprimelos
# ejemplo de ejecucuion: 2,3,4,5,6
print('rango de 2 a 6')
rango = range(2, 7)
for i in rango:
    print(i)


# ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de uno en 1
# ejemplo de ejecucion: 3,5,7,9
print('rango de 3 a 10 con incremento de 2 en 2')
for i in range(3, 11, 2):
        print(i)
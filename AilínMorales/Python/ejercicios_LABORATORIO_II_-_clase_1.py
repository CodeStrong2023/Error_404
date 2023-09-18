"""#iterar un rango del 0 a 10 e imprimir numeros divisibles entre 3
#ej: 0 3 6 9 
for x in range(10):
    if x % 3 == 0:
        print(x)
#ej 2: crear un rango de numeros del 2 al 6 e imprimirlos
#ej: 2 3 4 5 6

for x in range (2,7):
    print(x)
    
    
  
#ejercicio 3: crear un rango de 0 a 10 pero con incremento de 2 en 2 en lugar de 1 en 1


for x in range(0,11,2):
    print(x)
    

print("intento opcion 2")

for x in range(11):
    if x % 2 == 0:
        print(x)
    """
    
tupla = (13,1,8,3,2,5,8)
lista = []
for x in tupla:
    if x < 5:
        lista.append(x)
print(lista)

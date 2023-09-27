# Ejercicio 6.1: LLenar una lista
# LLenar una lista con los números del 1 al 50, luego mostrar
# La lista con el buble for, los elementos deben mostrarse
# de la siguiente forma:
#1-2-3-4-5...50

"""
lista = []
i = 1
while i <= 50:
    lista.append(i)
    i += 1
    
for i in lista:
    print(i,end="-")
    
"""

lista = list(range(1,51))
for i in lista:
    print(i,end="-")
    
"""
Ejercicio 1: Eliminar duplicados de una lkista
escriba un programa donde tenga una lista y que a continuación
elimine los elementos repetidos, por último mostrar la lista.
"""
lista = [1,2,3,4,5,4,3,2,2,10,"Lucas","Lara", "Ian", "Claudio"]
conjunto = set(lista) #la lista pasa a conjunto
lista = list(conjunto)
print(lista)
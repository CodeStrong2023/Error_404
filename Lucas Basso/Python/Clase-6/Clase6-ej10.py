#Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres
cadena = input("Dijite una Ccadena: ")
lista = []
for i in cadena:
    if i not in lista: #si el caracter no esta aun en la lista
        lista.append(i) # Lo agregamos a la lista
print(f"\nLista de caracteres sin repetir ninguno: \n {lista}")

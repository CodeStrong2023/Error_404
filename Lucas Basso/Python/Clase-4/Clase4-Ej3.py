"""
# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte


# nombre: Gandalf
# Clase: Mago
# Raza: Istar 


# nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar


personajes = [] #créa lista vacía
#creamos diccionarios
P = { "nombre": "Aragon","Clase":"Guerrero","Raza": "Dúnadan del Norte"}
personajes.append(P) #Se agrega a la lista un personaje
P = { "nombre": "Gandalf","Clase":"Mago","Raza": "Istar"}
personajes.append(P)
P = { "nombre": "Legolas","Clase":"Arquero","Raza": "Elfo Sindar"}
personajes.append(P)
#for x in personajes:
    #personajes(value,)
print(personajes)

 """
 
personajes = [
    { "nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del Norte" },
    { "nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar" },
    { "nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar" }
]

for personaje in personajes:
    print("Nombre:", personaje["nombre"])
    print("Clase:", personaje["Clase"])
    print("Raza:", personaje["Raza"])
    print()  # Agrega una línea en blanco entre cada personaje
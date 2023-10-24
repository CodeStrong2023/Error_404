# Ejercicio 02: Función con * args para multiplicar
# crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la funcipon y regresar como resultado
#la multiplicación de todosls valores pasados como argumento


def multiplicar_valores(*numeros):
    resultado = 1 #El cero no nos ayuda a multiplicar 
    for numero in numeros:
        resultado *= numero
    
    return resultado

#llamamos a la fución
print(multiplicar_valores(3,5,15)) #Le pasamos los argumentos
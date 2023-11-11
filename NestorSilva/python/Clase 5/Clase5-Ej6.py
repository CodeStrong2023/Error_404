'''
Ejercicio 6: Tabla de multiplicar
Hacer un programa que pida un número por teclado y guarde en una lista su tabla
de multiplicar hasta el 10; por ejemplo:
si digita el 5 la lista tendrá; 5,10,15,20,25,30,35,40,45,50

'''

numero = int(input("digite un número: "))
multiplicado = []
multis = []
for i in range(1, 11):
    multis.append(i)
    multiplicado.append(i*numero)
print(f"\n Tabla de multiplicar del numero {numero}: \n {multiplicado}")

for i in range(1, 11):
    print(f"{numero} x {i} = {multiplicado[i-1]}")
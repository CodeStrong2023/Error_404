var nombre = 'Carlos';
var apellido = ' Montes';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Ailin'+' '+'Morales';
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17; //Aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = nombre + (78 + 17)
console.log(juntos)
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Tercera Concatenacion usando el operador simplificado
console.log(nombre);
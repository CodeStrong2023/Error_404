// tipos de datos en JavaScript
/*
La sintaxis de comentarios es similar a Java.
*/

// Dato texto

var nombre = "Lucas"; // Variable tipo string (str)
console.log(nombre);

// Dato numerico

var suma = 2+1; // Variable tipo entero (int)
console.log(suma);
console.log(typeof suma); // Typeof nos dice de que tipo de dato estamos hablando

suma = suma + 2;
console.log(suma);

// Dato objetos

var objeto = {
    nombre : "Lucas",
    apellido : "Basso",                 // Variable tipo objeto
    usuario_git : "lucasbasso533",
    telefono : "45618685"
}

console.log(objeto);
console.log(typeof objeto);

// Datos booleanos

var bandera = true;     // Variable de tipo booleano verdadera.
console.log(bandera);
console.log(typeof bandera);

var bandera2 = false;   // Variable de tipo booleano falsa.
console.log(bandera2);

// Tipo de dato funcion

function mifuncion(){}
console.log(typeof mifuncion);

// Tipo de dato symbol

var simbolo = Symbol('Me gusta la programación');
console.log(simbolo);
console.log(typeof simbolo);

// Tipo de dato Clase

class Persona{
    constructor(nombre, apellido, telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
console.log(Persona);
console.log(typeof Persona);
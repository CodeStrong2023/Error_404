// Ejercicio 1: calcular estación del año
//Ejercicio 2: Hora del día
let mes = 9;
let estacion; //undefinded
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de = "+ estacion);
//Ejercicio 2: Hora del día

/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/ 
let horaDia = 7;
let mensaje;
if(horaDia >= 6 && horaDia <=11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <=16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <=19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <=23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);


//estructura Switch(la sintaxises igual a Java)

switch(mes){ //No solo se pueden utilizar número, tambien cadenas
    case 1: case 2: case 12:
        estacion = "verano";
        break;
    case 4: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 12:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+ estacion);


const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); // solo se ejecuta el console anterior

//Evitar repetir tu código
//dry don't repeat yourself

let days = "Sabado";
switch (days) {
    case "Lunes":
        console.log("Hoy es " + days)
        break;
    case "Martes":
        console.log("Hoy es " + days)
        break;
    case "Miercoles":
        console.log("Hoy es " + days)
        break;
    case "Jueves":
        console.log("Hoy es " + days)
        break;
    case "Viernes":
        console.log("Hoy es " + days)
        break;
    case "Sabado":
        console.log("Hoy es " + days)
        break;
    case "Domingo":
    console.log("Hoy es " + days)
    break;
    default:
        console.log("Error en el ingreso del día de la semana");
        break;
}

//opción mejorada
let days2 = ["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"];
function getDay(n){
    if (n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n-1];
}
console.log(getDay(5));


//EJERCICIO SIMILAR CON LOS MESES DEL AÑO, CON ESTRUCTURA SWITCH Y LA FUNCIÓN MEJORADA

let month = 11;
switch (month) {
    case 1:
        console.log("Es Enero")
        break;
    case 2:
        console.log("Es Febrero")
        break;
    case 3:
        console.log("Es Marzo")
        break;
    case 4:
        console.log("Es Abril")
        break;
    case 5:
        console.log("Es Mayo")
        break;
    case 6:
        console.log("Es Junio")
        break;
    case 7:
        console.log("Es Julio")
        break;
    case 8:
        console.log("Es Agosto")
        break;
    case 9:
        console.log("Es Septiembre")
        break;
    case 10:
        console.log("Es Octubre")
        break;
    case 11:
        console.log("Es Noviembre")
        break;
    case 12:
        console.log("Es Diciembre")
        break;

    default:
        break;
}

let month2 = ["Enero","Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","octubre","Noviembre","Diciembre"];
function getmonth(x){
        if (x < 1 || x > 12){
            throw new Error("Número fuera de rango");
        } 
        return month2[x-1];
}
console.log(getmonth(2));


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
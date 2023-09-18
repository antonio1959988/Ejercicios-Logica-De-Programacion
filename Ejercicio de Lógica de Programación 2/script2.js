//Asignar variables necesarias traidas desde el html
let gradosCelsius = document.getElementById("txtCelsius");
let botonKelvin = document.getElementById("btnKelvin");
let botonFarenheit = document.getElementById("btnFarenheit");
let bloqueResultado = document.getElementById("contenedor2");
let botonBorrar = document.getElementById("btnBorrar2");

//Funcion de conversion a Farenheit
function convertirAFarenheit(c) {

    //Convertir valor a int
    valorCelsius = parseInt(gradosCelsius.value);

    //Condicional que evalua si el dato ingresado es numero
    if (!isNaN(valorCelsius)) {
        let farenheit = (valorCelsius * 9 / 5) + 32;
        bloqueResultado.innerHTML = `<p>El resultado es ${farenheit}° F</p>`;
    } else{
        bloqueResultado.innerHTML = "<p>ERROR: No ingresaste un número</p>"
    }
  
}

//Funcion de conversion a Kelvin
 function convertirAKelvin() {

    //Convertir valor a int
    valorCelsius = parseInt(gradosCelsius.value);

    //Condicional que evalua si el dato ingresado es numero
    if (!isNaN(valorCelsius)) {
        let kelvin = valorCelsius + 273.15
        bloqueResultado.innerHTML = `<p>El resultado es ${kelvin}° K</p>`;
    } else{
        bloqueResultado.innerHTML = "<p>ERROR: No ingresaste un número</p>"
    }
 }
 
 function borrarContenido(){
    bloqueResultado.innerHTML = " ";
 }

botonFarenheit.addEventListener("click", convertirAFarenheit);
botonKelvin.addEventListener("click", convertirAKelvin);
botonBorrar.addEventListener("click", borrarContenido);

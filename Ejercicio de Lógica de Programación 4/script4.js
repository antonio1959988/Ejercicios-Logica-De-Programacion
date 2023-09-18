//Inicializar variables a utilizar desde el formulario
let botonSerie = document.getElementById("btnSerie");
let botonBorrar = document.getElementById("btnBorrar4");
let contenedor = document.getElementById("contenedor4");

//Funcion principal para realizar la serie
function calcularSerie() {
    let numero = document.getElementById("txtNum2").value; //Obtener directamente el valor del input

    //Condicion para saber si el dato ingresado es numero
    if (!isNaN(numero)) {

        //Convertir el valor de numero a integer
        parseInt(numero);

        //Inicia serie con un array para tomar en cuenta sus valores despues
        let array = [0, 1];

        //Uso de ciclo for para calcular serie, sumando los dos primeros elementos del array para calcular el consecutivo
        for (let i = 2; i < numero; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        //Agregar un parrafo dentro del container 4 el resultado
        contenedor.innerHTML = `<p>Serie fibonacci ${array}</p>`

    } else {
        contenedor.innerHTML = "<p>ERROR: No ingresaste un numero<./p>"
    }
}

//Funcion para borrar contenido
function borrarContenido(){
    contenedor.innerHTML = " ";
}

//Evento del boton que inicia con el calculo
botonSerie.addEventListener("click", calcularSerie);

//Evento para borrar datos mostrados
botonBorrar.addEventListener("click", borrarContenido);
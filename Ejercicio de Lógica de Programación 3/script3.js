
//Inicializar variables a utilizar dandoles los valores asignados en el formulario
let numero = document.getElementById("txtNum");
let botonFactorial = document.getElementById("btnFactorial");
let botonBorrar = document.getElementById("btnBorrar3");
let contenedor = document.getElementById("contenedor3");

//Funcion que inicializa las operaciones 
function calcularFactorial(){

    //Obtener el value de nuestro input
    let valorNumero = numero.value;

    //Condicional para saber si el valor ingresado es un numero
    if (!isNaN(valorNumero)){
        parseInt(valorNumero); //Conversion a int

        //Uso de ciclo for para calcular factorial
        let factorial = 1;
        for (i = 1; i <= valorNumero; i++){
            factorial *= i;
        }
        //Imprimir en un parrrafo el valor del factorial con una template string
        contenedor.innerHTML = `<p>El factorial es ${factorial}</p>`
    
    } else {
        contenedor.innerHTML += "<p>ERROR: No ingresaste un numero</p>"
    }
}

//Funcion que borra el contenido html
function borrarContenido(){
    contenedor.innerHTML = " ";
}

//Evento de botón que inicia la funcion principal
botonFactorial.addEventListener("click", calcularFactorial);

//Evento de boton que borra el contenido del html
botonBorrar.addEventListener("click", borrarContenido);
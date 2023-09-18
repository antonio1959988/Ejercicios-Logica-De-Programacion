//Inicializar variables necesarias desde el html y asignamos un array para registrar los intentos
let botonResultado = document.getElementById("btnResultado2");
let botonBorrar = document.getElementById("btnBorrar5")
let contenedor = document.getElementById("contenedor5");
let intentos = [];

//Funcion que se asignara al boton resultado
function adivinarNUmero() {

    //Declaramos el valor del input dentro de esta funcion para que sea dinamico y cambie 
    let numero = document.getElementById("txtNum3").value;

    //Condicion que evalua si el dato ingresado es numero
    if (!isNaN(numero)) {

        parseInt(numero); //Conversion del numero a int
        let numCorrecto = 17; //Numero correcto

        //Condicion que evalua el rango en el que está el numero secreto
        if (numero >= 1 && numero <= 100) {

            //Cuando coincida, imprimir los intentos almacenados en el array
            if (numero == numCorrecto) {
                contenedor.innerHTML += "<p>Felicidades, adivinaste el número secreto.</p>";
                contenedor.innerHTML += `<p>Tuviste ${intentos.length} intentos: ${intentos}</p>`;
            } else{
                contenedor.innerHTML += `<p>Ups, el número ${numero} no es el correcto, vuelve a intentarlo.</p>`;
            }
             
            //Almacenar cada intento en el array
            intentos.push(numero);
              
        } else {
            contenedor.innerHTML += "<p>ERROR: No escribiste un número dentro del rango</p>";
        }

    } else {
        contenedor.innerHTML = "<p>ERROR: No ingresaste un número</p>"
    }
}

//Funcion para borrar texto en el html
function borrarContenido(){
    contenedor.innerHTML = " ";
}

//Eventos de cada boton
botonResultado.addEventListener("click", adivinarNUmero);
botonBorrar.addEventListener("click", borrarContenido);
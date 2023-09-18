//Llamar a los inputs desde el html y asignarlos a variables
let valor1 = document.getElementById("valor1");
let valor2 = document.getElementById("valor2");
let valor3 = document.getElementById("valor3");
let botonResultado = document.getElementById("btnResultado");
let botonBorrar = document.getElementById("btnBorrar1");

//Este div se utilizará para imprimir en el index los resultados
let bloqueResultado = document.getElementById("contenedor1");



function ordenar() {

    //solicitud de datos
    let dato1 = valor1.value;
    let dato2 = valor2.value;
    let dato3 = valor3.value;


    //Array para almacenar datos
    let array = [dato1, dato2, dato3];

    //Mayor a menor, funcuin sort para alterar el orden (funcion flecha para indicar que el orden no es string) y foreach para imprimir una linea de codigo para cada posicion
    bloqueResultado.innerHTML = "<p>Mayor a menor</p>";

    array.sort((a, b) => b - a);
    array.forEach(function (numero, indice) {
        bloqueResultado.innerHTML += `Posicion ${indice + 1}: ${numero} <br>`;
    });

    //Menor a mayor, funcuin sort para alterar el orden (funcion flecha para indicar que el orden no es string) y foreach para imprimir una linea de codigo para cada posicion
    bloqueResultado.innerHTML += "<p>Menor a mayor</p>"

    array.sort((a, b) => a - b);
    array.forEach(function (numero, indice) {
        bloqueResultado.innerHTML += `Posicion ${indice + 1}: ${numero} <br>`;
    })

    //If para valores iguales
    if (dato1 == dato2 && dato2 == dato3 && dato3 == dato1) {
        alert("Todos los valores son iguales.");
    } else if (dato1 == dato2) {
        alert(`${dato1} y ${dato2} son iguales`);
    } else if (dato2 == dato3) {
        alert(`${dato2} y ${dato3} son iguales`);
    } else if (dato3 == dato1) {
        alert(`${dato3} y ${dato1} son iguales`);
    } else {
        alert("Todos los valores son diferentes.")
    }

  
}

//Funcion que elimina contenido del html
function borrarContenido(){
    bloqueResultado.innerHTML = " ";
}

botonResultado.addEventListener("click", ordenar);
botonBorrar.addEventListener("click", borrarContenido);

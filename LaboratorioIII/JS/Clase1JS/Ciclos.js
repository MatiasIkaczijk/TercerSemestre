// var contador
let contador = 0;
while(contador<3){ // condiciones
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo")

// do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while")


// ciclo for
for(let contando = 0; contando <3; contando++){
    console.log(contando);
}
console.log("Fin del ciclo for")

//break

for(let contando = 0; contando<= 10; contando++){
    if(contando %2 == 0){
        console.log(contando); // muestra pares
        break;
    }
}
console.log("termina el ciclo al encontrar el primer num par ")

// continue cuando el num no es par
// etiqueta label:

inicio:
for(let contando = 0; contando<= 10; contando++){
    if(contando %2 !== 0){
        break inicio;
    }
    console.log(contando)
}
console.log("Termina el ciclo")

// etiquetas labels, permite ir a una parte de nuestro programa


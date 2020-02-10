var json1 = {
    nombre: "Jhon",
    edad: 20,
    casado: false,
    mascota:[
        'Coco'
    ],
    colegio: {
        nombreColegio: 'Montufar',
        telefono: 0992808583,
        a:''
    }
};
var jsonJhon={
    nombre: jhon,
    apellido: montenegro
}
console.log('hola');
console.log(json1);
console.log (json1, jsonJhon);
var nu=null;
console.log(typeof jhon);
var numero=1;
var bool=false;
console.log(bool + numero);
console.log(nu + numero);
console.log(undefined + numero);
console.log(undifined + 'asdf');
console.log(nu + numero);
console.log(nu + numero);

//funciones
var mifuncion=function(){
    console.log('funcion 1');
    return 'a';
};
//funciones flecha borda
var mifuncion2=()=>{
    return 'hola mundo';
};

//mifuncion;
console.log(mifuncion());
console.log(mifuncion2());


var arreglo=[
    {nombre:'jhon',
    apellido:'montenegro',
    edad:20},
    {nombre:'Juan',
    apellido:'perez',
    edad:45},
    {nombre: 'stalin',
    apellido: 'sarango',
    edad: 22}
];
var buscarUnUsuario=(arreglo,usuarioaBuscar)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === usuarioaBuscar;
    });
    console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo,'jhon');

var agregarUsuario=(arreglo,nombre,apellido,edad)=>{
    arreglo.unshift({nombre,apellido,edad});
    console.log(arreglo);
};
agregarUsuario(arreglo,'carlos','jimenez',34);

var buscarUnUsuarioYagregar=(arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === nombre;
    });
    if(usuarioEncontrado===undefined){
        console.log('El usuario no existe');
        agregarUsuario(arreglo,nombre,'Mon',24);
    }else{
        console.log(usuarioEncontrado);
    }
};
buscarUnUsuarioYagregar(arreglo,'Daniela');

var eliminarUsuario= (arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.filter(usuario=>{
        return usuario.nombre !== nombre;
    });
    console.log(usuarioEncontrado);
};
eliminarUsuario(arreglo,'Daniela');

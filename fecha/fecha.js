const moment = require('moment')

var fecha=new Date();
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getDay());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());
console.log(fecha.getDay() + fecha.getMonth() + fecha.getFullYear());
console.log(fecha.getDay (), fecha.getMonth() , fecha.getFullYear());
//console.log('dia:' ${(fecha.getDay()} , fecha.getMonth , fecha.getFullYear())

const horaActual=moment().format('hh:mm:ss')
console.log(moment().format('dddd'));
console.log(horaActual);
console.log(moment().add(3,'hours').toString());
console.log(moment().subtract(3,'hours').toString());

console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(moment().startOf('hour').toString());
console.log(moment().toObject());
console.log(typeof moment().toObject()['years']);

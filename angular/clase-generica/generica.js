var PilaGenerica = /** @class */ (function () {
    function PilaGenerica() {
        this.vec = [];
    }
    PilaGenerica.prototype.insertar = function (x) {
        this.vec.push(x);
    };
    PilaGenerica.prototype.extraer = function () {
        return this.vec.length > 0 ? this.vec.pop() : null;
    };
    return PilaGenerica;
}());
var pilaNumber;
pilaNumber = new PilaGenerica();
pilaNumber.insertar(10);
pilaNumber.insertar(5);
pilaNumber.insertar(10);
console.log(pilaNumber.extraer());
var pilaString;
pilaString = new PilaGenerica();
pilaString.insertar('oscar');
pilaString.insertar('Omar');
pilaString.insertar('Graciano');
pilaString.insertar('Simental');
console.log(pilaString.extraer());
var Persona = /** @class */ (function () {
    function Persona(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    return Persona;
}());
var pilaPersona;
pilaPersona = new PilaGenerica();
pilaPersona.insertar(new Persona('Oscar', 35));
pilaPersona.insertar(new Persona('Chriselle', 36));
pilaPersona.insertar(new Persona('Ofelia', 58));
console.log(pilaPersona.extraer());

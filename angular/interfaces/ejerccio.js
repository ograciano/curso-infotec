var Avion = /** @class */ (function () {
    function Avion(nombre, velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }
    Avion.prototype.volar = function () {
        console.log("EL avion puede volar muy rapido");
    };
    return Avion;
}());
var Helicoptero = /** @class */ (function () {
    function Helicoptero(nombre, velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }
    Helicoptero.prototype.volar = function () {
        console.log("El helicoptero puede volar pero no tan rapido como un avion");
    };
    return Helicoptero;
}());
var avion;
avion = new Avion('Avion', 1500);
avion.volar();
var helicoptero;
helicoptero = new Helicoptero('Helicoptero', 500);
helicoptero.volar();

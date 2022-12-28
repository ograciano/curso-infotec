interface Aeronave {
    volar(): void;
}

class Avion implements Aeronave{
    private nombre: string;
    private velocidad: number;

    constructor(nombre: string, velocidad: number) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }
    volar(): void {
        console.log("EL avion puede volar muy rapido")
    }
}

class Helicoptero implements Aeronave {
    private nombre: string;
    private velocidad: number;

    constructor(nombre: string, velocidad: number) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    volar(): void {
        console.log("El helicoptero puede volar pero no tan rapido como un avion");
    }
}


let avion: Avion;
avion = new Avion('Avion', 1500);
avion.volar();

let helicoptero: Helicoptero;
helicoptero = new Helicoptero('Helicoptero', 500);
helicoptero.volar();
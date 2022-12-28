class PilaGenerica<T> {
    private vec: T[] = [];

    insertar(x: T): void {
        this.vec.push(x);
    }

    extraer() {
        return this.vec.length > 0 ? this.vec.pop() : null;
    }
}

let pilaNumber: PilaGenerica<number>;
pilaNumber = new PilaGenerica<number>();
pilaNumber.insertar(10);
pilaNumber.insertar(5);
pilaNumber.insertar(10);
console.log(pilaNumber.extraer());


let pilaString: PilaGenerica<string>;
pilaString = new PilaGenerica<string>();
pilaString.insertar('oscar');
pilaString.insertar('Omar');
pilaString.insertar('Graciano');
pilaString.insertar('Simental');
console.log(pilaString.extraer());

class Persona {
    constructor(public nombre: string, public edad: number) {
    }
}

let pilaPersona: PilaGenerica<Persona>;
pilaPersona = new PilaGenerica<Persona>();
pilaPersona.insertar(new Persona('Oscar', 35));
pilaPersona.insertar(new Persona('Chriselle', 36));
pilaPersona.insertar(new Persona('Ofelia', 58));
console.log(pilaPersona.extraer());
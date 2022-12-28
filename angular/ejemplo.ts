export const sumar = (valor1: number, valor2: number, valor3?: number,): number => {
    let suma = 0;
    valor3 ? suma = valor1 + valor2 + valor3 : suma = valor1 + valor2;
    return suma; 
}
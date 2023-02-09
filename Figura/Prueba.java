package Figura;

public class Prueba {

    public static void main(String[] args) {
        Figura[] arrayFiguras = new Figura[3];
        arrayFiguras[0] = new Cuadrado(4, "Amarillo");
        arrayFiguras[1] = new Cuadrado(7, "Rojo");
        arrayFiguras[2] = new Triangulo(2, 3, "Azul");

        /* Al declarar la condición del 'for' es necesario poner restar 1 a "arrayFiguras.length" porque
        sino busca en la posición 3, la cual no existe en este caso, por lo que estaría fuera del array.
        */
        
        for(int i=0; i<= arrayFiguras.length - 1; i++){
            System.out.println("El área de la figura es " + arrayFiguras[i].calcularArea());
        }
    }
}
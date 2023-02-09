package Figura;

class Cuadrado extends Figura {

    int ladoCuadrado;

    Cuadrado(int ladoCuadrado, String color) {
        super(color);
        this.ladoCuadrado = ladoCuadrado;
    }

    public int getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(int lado) {
        this.ladoCuadrado = lado;
    }

    int calcularArea(){
        return ladoCuadrado * ladoCuadrado;
    }
}

package Figura;

class Triangulo extends Figura{

    float areaTriangulo;
    float baseTriangulo;
    float alturaTriangulo;

    public Triangulo(float baseTriangulo, float alturaTriangulo, String color) {
        super(color);
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }

    public float getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(float baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public float getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(float alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    int calcularArea(){
        return (int) ((baseTriangulo*alturaTriangulo)/2);
    }
}

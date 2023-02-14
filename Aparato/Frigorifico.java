package Aparato;

public class Frigorifico extends Aparato{

    float capacidad;
    float altura;

    public Frigorifico() {
        super();
        this.capacidad = 300;
        this.altura = 170;
    }

    public Frigorifico(float PVP, float peso) {
        super(PVP, peso);
        this.capacidad = capacidad;
        this.altura = altura;
    }

    public Frigorifico(float PVP, float peso, String color, char consumoEnergertico, float capacidad, float altura) {
        super(PVP, peso, color, consumoEnergertico);
        this.capacidad = capacidad;
        this.altura = altura;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    double aplicarDescuento(){

        // Se aplica "super" para llamar al método de la clase padre.

        super.aplicarDescuento();

        /* En el "if" recuperamos el valor del atributo getConsumoEnergetico de la clase padre y del precio
           para establecer la condición y aplicar el descuento al precio de la superclase.
         */

        if((super.getConsumoEnergertico() == 'A' || super.getConsumoEnergertico() == 'B') && capacidad > 400){
            super.setPVP((float) (super.getPVP()*0.9));
        } return super.getPVP();
    }
}

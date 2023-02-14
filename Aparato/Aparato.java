package Aparato;

public class Aparato {

    float PVP;
    float peso;
    String color;
    char consumoEnergertico;

    // Constructor por defecto.

    Aparato(){
        this.color = "blanco";
        this.consumoEnergertico = 'F';
        this.peso = 5;
        this.PVP = 100;
    }

    // Constructor con PVP y peso, el resto por defecto.

    Aparato(float PVP, float peso){
        this.color = "blanco";
        this.consumoEnergertico = 'F';
        this.peso = peso;
        this.PVP = PVP;
    }

    // Constructor con todos los atributos.

    public Aparato(float PVP, float peso, String color, char consumoEnergertico) {

        /*
           Se crea un if con el método "comprobarConsumo" para declarar que si el carácter introducido está entre los
           seleccionados de la tabla ASCII lo muestre, sino es el caso pondrá el valor por defecto, es decir 'F'.
        */

        if(comprobarConsumo(consumoEnergertico)){
            this.consumoEnergertico = consumoEnergertico;
        }else{
            this.consumoEnergertico = 'F';
        }

        this.PVP = PVP;
        this.peso = peso;
        this.color = color;
    }

    public float getPVP() {
        return PVP;
    }

    public void setPVP(float PVP) {
        this.PVP = PVP;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergertico() {
        return consumoEnergertico;
    }

    public void setConsumoEnergertico(char consumoEnergertico) {
        this.consumoEnergertico = consumoEnergertico;
    }

    boolean comprobarConsumo(char consumoEnergertico){
        return (consumoEnergertico >= 65 && consumoEnergertico <= 70);
    }

    double aplicarDescuento(){

        /*
           Se crea un "switch" con el parámetro color para que, en el caso de que el color sea gris, genere un
           descuento del 5%.
        */

        switch(color){
            case "gris":
                PVP *= 0.95;
        }

        /*
           En el siguiente caso se hace lo mismo que en el "switch" anterior, solo que en este caso aplicamos los
           descuentos según la letra de consumo del producto.
        */

        switch(consumoEnergertico){
            case 'A':
                return PVP *= 0.80;
            case 'B':
                return PVP *= 0.85;
            case 'C':
                return PVP *= 0.90;
            case 'D':
                return PVP *= 0.95;
        }
        return PVP;
    }
}

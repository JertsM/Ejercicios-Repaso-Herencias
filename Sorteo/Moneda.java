package Sorteo;

public class Moneda extends Sorteo{

    Moneda() {
        posibilidades = 2;
    }

    @Override
    public int lanzar() {

        int datoMoneda = (int)(Math.random()* posibilidades + 1);

        if(datoMoneda == 1){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }

        return datoMoneda;
    }
}

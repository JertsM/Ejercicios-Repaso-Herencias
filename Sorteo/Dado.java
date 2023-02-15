package Sorteo;

public class Dado extends Sorteo{

    Dado(){
        posibilidades = 6;
    }

    @Override
    public int lanzar() {

        int datoDado = (int)(Math.random() * posibilidades + 1);
        System.out.println(datoDado);
        return datoDado;
    }
}

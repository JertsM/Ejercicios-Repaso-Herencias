package Sorteo;

public abstract class Sorteo {

    protected int posibilidades;

    public Sorteo(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    protected Sorteo() {
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public abstract int lanzar();
}

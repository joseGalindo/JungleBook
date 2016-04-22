package mx.unam.fciencias.util;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public class Nodo<E> {
    
    private E valor;
    private Nodo padre;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;
    private int diferenciaNodos;

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public int getDiferenciaNodos() {
        return diferenciaNodos;
    }

    public void setDiferenciaNodos(int diferenciaNodos) {
        this.diferenciaNodos = diferenciaNodos;
    }
    
    
    
}

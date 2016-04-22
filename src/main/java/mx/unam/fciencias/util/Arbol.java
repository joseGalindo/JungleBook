package mx.unam.fciencias.util;

import java.util.List;

/**
 *
 * @author José Cruz Galindo Martínez
 * @param <E> El tipo de elementos que vamos a utilizar
 */
public interface Arbol<E> {
    
    public void agregar(E elemento);
    public boolean eliminar(E elemento);
    public List<E> recorridoPreOrden();
    public List<E> recorridoInOrden();
    public List<E> recorridoPostOrden();
}

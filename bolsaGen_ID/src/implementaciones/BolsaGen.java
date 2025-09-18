package implementaciones;


/* Esta clase va a servir como contenedor de los datos para guardar datos */
import excepciones.BolsaException;

public class BolsaGen<T> {
    private T[] elementos;
    private int tamMax;
    private int numObjetos;

    @SuppressWarnings("unchecked")
    public BolsaGen(int tamMax) {
        if (tamMax < 0) {
            throw new BolsaException("El tamaño no puede ser negativo");
        }
        this.tamMax = tamMax;
        this.numObjetos = 0;
        this.elementos = (T[]) new Object[tamMax];
    }

    public void agrega(T obj) {
        if (numObjetos >= tamMax) {
            throw new BolsaException("La bolsa está llena");
        }
        elementos[numObjetos++] = obj;
    }

    public T saca() {
        if (numObjetos == 0) {
            throw new BolsaException("La bolsa está vacía");
        }
        return elementos[--numObjetos];
    }

    public int getNumObjetos() {
        return numObjetos;
    }

    public boolean estaVacia() {
        return numObjetos == 0;
    }

    public boolean estaLlena() {
        return numObjetos == tamMax;
    }

    // 🔧 Método protegido para que BolsaGenNum pueda usarlo
    protected T getElemento(int i) {
        return elementos[i];
    }
    
}

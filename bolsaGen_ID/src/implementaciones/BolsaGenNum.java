package implementaciones;

import excepciones.BolsaException;


/* Esta clase es especificamente para los numeros */
public class BolsaGenNum<T extends Number> extends BolsaGen<T> {

    public BolsaGenNum(int tamMax) {
        super(tamMax);
    }

    public double suma() {
        if (estaVacia()) {
            throw new BolsaException("No se puede sumar, la bolsa está vacía");
        }
        double suma = 0;
        for (int i = 0; i < getNumObjetos(); i++) {
            suma += getElemento(i).doubleValue(); 
        }
        return suma;
    }

    public double promedio() {
        if (estaVacia()) {
            throw new BolsaException("No se puede calcular el promedio, la bolsa está vacía");
        }
        return suma() / getNumObjetos();
    }

    public int mayores() {
        if (estaVacia()) {
            throw new BolsaException("No se puede calcular, la bolsa está vacía");
        }
        double prom = promedio();
        int cont = 0;
        for (int i = 0; i < getNumObjetos(); i++) {
            if (getElemento(i).doubleValue() > prom) { 
                cont++;
            }
        }
        return cont;
    }
}

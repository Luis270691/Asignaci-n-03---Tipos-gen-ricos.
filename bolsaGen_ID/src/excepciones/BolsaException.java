
package excepciones;


/**
 /* Esta clase sirve para excepciones de errores especificos que tengan que ver con la bolsa si esta llena o vacia, si el tamaño es menor a 0, etc*/
 
public class BolsaException extends RuntimeException {
    

   public BolsaException() {
        super();
    }

    public BolsaException(String s) {
        super(s);
    }
}

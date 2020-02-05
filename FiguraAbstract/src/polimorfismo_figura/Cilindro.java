package polimorfismo_figura;

import javax.accessibility.AccessibleContext;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class Cilindro extends Circulo{
    
    private int altura;

    public Cilindro(int radio, int x, int y) {
        super(radio, x, y);
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }    
    
}

package polimorfismo_figura;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Circulo extends Punto{
    
    int radio;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int x, int y) {
        super(x, y);
    }

    public void dibujo(Graphics g){
        g.setColor(Color.red);
        g.drawOval(super.getX(), super.getY(), this.radio, this.radio);
    }
    public void Circulo(){
    
    int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Radio", "Círculo", 1));

    this.radio = dato;
    
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + this.radio + '}';
    }
    
    
    
}

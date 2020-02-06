package figura2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class Circulo extends Punto {
    private int radio;
    static final double PI=3.1416; 
            
    public Circulo() {
        String radio=JOptionPane.showInputDialog(null,"Ingrese el valor del radio");
        this.radio=Integer.parseInt(radio);
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
     public double getDiametro() {
        return 2 * this.radio;
    }

    public double getCircunferencia() {
        return Math.PI * this.getDiametro();
    }
    
    public double getArea() {
        return Math.PI * getRadio() * getRadio();
    }
    
    public void paint(Graphics g) {        

        g.setColor(Color.DARK_GRAY);

        g.drawOval(super.getX(), super.getY(), (int) this.radio, (int) this.radio);
    }
    
    public double area(){
        return PI * Math.pow(radio,2);
    }
    
    @Override

    public String toString() {
        return "\n Circulo" + super.toString() + " \n Radio= " + this.radio + "Area= "+this.area();

    }
    
}

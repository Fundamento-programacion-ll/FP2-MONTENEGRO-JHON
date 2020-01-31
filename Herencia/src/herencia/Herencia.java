package herencia;

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perrito=new Perro(10, "huskie", "macho", "Coco", 5);
        perrito.datosPerro();
        perrito.sumaPerro(0, 0);
        //--------------------------------
        Gato gatito=new Gato("azules", "Persa", "hembra", "gatito", 2);
        gatito.datosGato();
        gatito.sumaGato(0, 0);
    }
}

package proyecto_2;

/**
 *
 * @author forza
 */
public class Proyecto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche c = new Coche(240, 0, 0, 34, 4);
        c.llenarDeposito(3);
        c.aumentarMedia();
        c.aumentarMedia();
        c.aumentarMedia();
        
        
        GestorVehiculo gestor = new GestorVehiculo();
        gestor.addVehiculo(c);
        gestor.mostrarVehiculos();
        
        Vista v = new Vista();
        
        
    }
    
}

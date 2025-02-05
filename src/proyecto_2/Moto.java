package proyecto_2;

/**
 *
 * @author forza
 */
public class Moto extends Vehiculo{
    
    private boolean alamcenameintoAdicional;
    
    //------------Constructores--------------
    
    public Moto(int vmax, int vmed, int dep, int max_dep, boolean almacenamiento){
        super(vmax, vmed, dep, max_dep);
    }
    
    public Moto(Moto otra){
        this(otra.getVelocidad_max(), otra.getVelocidad_media(), otra.getDeposito(), otra.getMax_deposito(), otra.isAlamcenameintoAdicional());
    }
    
    
    //------------Getters y Setters--------------

    public boolean isAlamcenameintoAdicional() {
        return alamcenameintoAdicional;
    }

    public void setAlamcenameintoAdicional(boolean alamcenameintoAdicional) {
        this.alamcenameintoAdicional = alamcenameintoAdicional;
    }
    
    
    //------------Funciones--------------
    
    public String informarDeposito(){
        return "La moto cuenta ahora con " + this.getDeposito() + " litros.";
    }
    
    public void llenarDeposito(int cantidad){
        super.llenarDeposito(cantidad);
        System.out.println(this.informarDeposito());
    }
    
    public String toString(){
        return "Moto:\nVelocidad: " + this.getVelocidad_media() +
                "\nVelocidad máxima: " + this.getVelocidad_max() +
                "\nDepoósito actual: " + this.getDeposito() +
                "\nDepósito máximo: " + this.getMax_deposito()+
                "\nAlmacenamiento_adicional: " + this.isAlamcenameintoAdicional();
    }
    
    
}

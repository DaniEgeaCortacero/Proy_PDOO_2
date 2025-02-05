package proyecto_2;

/**
 *
 * @author forza
 */
public class Coche extends Vehiculo{
    
    private int ruedas;
    
    //------------Constructores--------------
    
    public Coche(int vmax, int vmed, int dep, int max_dep, int ru) {
        super(vmax, vmed, dep, max_dep);
        ruedas = ru;
    }
    
    public Coche(Coche otro) {
        this(otro.getMax_deposito(), otro.getDeposito(), otro.getDeposito(), otro.getMax_deposito(), otro.getRuedas());
    }
    
    //------------Getters y Setters--------------

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    //------------Funciones--------------
    
    public String informarDeposito(){
        return "Se ha llenado el depósito del coche, ahora cuenta con  " + this.getDeposito() + " litros.";
    }
    
    public void llenarDeposito(int cantidad){
        super.llenarDeposito(cantidad);
        System.out.println(this.informarDeposito());
    }
    
    public String toString(){
        return "Coche:\nVelocidad: " + this.getVelocidad_media() +
                "\nVelocidad máxima: " + this.getVelocidad_max() +
                "\nDepoósito actual: " + this.getDeposito() +
                "\nDepósito máximo: " + this.getMax_deposito()+
                "\nNº ruedas: " + this.getRuedas();
    }
    
}

package proyecto_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author forza
 */
public class GestorVehiculo {
    
    List<Vehiculo> gestor;
    
    //------------Constructores--------------
    
    public GestorVehiculo(){
        gestor = new ArrayList<>();
    }
    
    public GestorVehiculo(List<Vehiculo> vehiculos){
        gestor = vehiculos;
    }
    
    public GestorVehiculo(GestorVehiculo otro){
        this(otro.gestor);
    }
    
    
    //------------Getters y Setters--------------

    public List<Vehiculo> getGestor() {
        return gestor;
    }

    public void setGestor(List<Vehiculo> gestor) {
        this.gestor = gestor;
    }    
    
    //------------Funciones--------------
    
    public void addVehiculo(Vehiculo v){
        gestor.add(v);
    }
    
    public String mostrarVehiculos(){
        String text = "";
        for(Vehiculo v : gestor){
            System.out.println(v.toString());
            text += v.toString() + "\n\n";
        }
        return text;
    }
    
}

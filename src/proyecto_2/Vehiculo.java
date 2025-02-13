package proyecto_2;

/**
 *
 * @author forza
 */
public class Vehiculo {
    private int velocidad_max, velocidad_media, deposito, max_deposito;
    private boolean is_lleno;
    
    //------------Constructores--------------
    
    public Vehiculo(int vmax, int vmed, int dep, int max_dep){
        this.velocidad_max = vmax;
        this.velocidad_media = vmed;
        deposito = dep;
        max_deposito = max_dep;
    }
    
    //------------Getters y Setters--------------
    
    public void setVelocidad_max(int velocidad){
        this.velocidad_max = velocidad;
    }
    
    public int getVelocidad_max(){
        return velocidad_max;
    }
    
    public void setVelocidad_media(int vel){
        this.velocidad_media = vel;
    }
    
    public int getVelocidad_media(){
        return this.velocidad_media;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        if(deposito == this.max_deposito){
            is_lleno = true;
        }else{
            is_lleno = false;
        }
        this.deposito = deposito;
    }

    public int getMax_deposito() {
        return max_deposito;
    }

    public void setMax_deposito(int max_deposito) {
        this.max_deposito = max_deposito;
    }

    public boolean isIs_lleno() {
        return is_lleno;
    }

    public void setIs_lleno(boolean is_lleno) {
        this.is_lleno = is_lleno;
    }
    
    //------------Funciones--------------
    
    public void aumentarMedia(){
        if(deposito > 0){
            velocidad_media += 10;
            deposito -= 1;
            if(velocidad_media > velocidad_max){
                velocidad_media = velocidad_max;
            }
        } else {
            System.err.println("Depósito vacío.");
            velocidad_media = 0;
        }
    }
    
    public void disminuirMedia(){
        velocidad_media -= 10;
    }
    
    public void llenarDeposito(int cantidad){
        deposito += cantidad;
        if(deposito > max_deposito){
            deposito = max_deposito;
        }
    }
    
    public void datosVelocidad(){
        System.out.println("La velocidad media es de: " + velocidad_media + " y su velocidad máxima es de: " + velocidad_max);
    }
    
}

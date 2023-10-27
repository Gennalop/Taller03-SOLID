package ec.edu.espol.seccionc;

public class Notificacion {
    public void notificar(Notificable notificacion, Pago pago){
        notificacion.enviarNotificacion(pago);
    }    
}

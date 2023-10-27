package ec.edu.espol.seccionc;

public class PagoPayPal extends Pago {
    private boolean loggedIn; //conexion a cuenta PayPal

    @Override
    public void realizarCobro(double monto){
        if (!loggedIn){
            LoggedIn();
        }
        //cargar el monto de compra el medio de pago
    }

    private void LoggedIn() {
        //logica para loggedIn
    }
}

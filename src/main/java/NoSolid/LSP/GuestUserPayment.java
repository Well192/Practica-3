package NoSolid.LSP;


public class GuestUserPayment implements Payment{

    String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void previousPaymentInfo(){
        System.out.println("Recuperando del usuario invitado, ultimos detalles de pagos.");
    }
    @Override
    public void newPayment(){
        System.out.println("Procesando de "+name+ " pago actual.");
    }
}


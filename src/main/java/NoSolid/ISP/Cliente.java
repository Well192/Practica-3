package NoSolid.ISP;

 import java.util.ArrayList;
 import java.util.List;

class Cliente {
    public static void main(String[] args) {
        EFax eFax = new EFax();
        System.out.println("Demostracion sin ISP");
        /*
        Impresora impresora = new ImpresoraAvanzada();
        impresora.printDocument();
        impresora.sendFax(eFax);

        impresora = new ImpresoraBasica();
        impresora.printDocument();
        impresora.sendFax(eFax);// Lanza un error
        */

        List<Impresora> impresoras = new ArrayList<>();
        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());
        /*
        for (Impresora dispositivo : impresoras) {
            dispositivo.printDocument();
            dispositivo.sendFax(eFax);
        }
        */
        impresoras.forEach((dispositivo)->{dispositivo.printDocument();
            dispositivo.sendFax(eFax);});

    }

}

package Solid.ISP;

public class ImpresoraAvanzada implements Impresora, DispositivoFax{
    public void printDocument(){
        System.out.println("La impresora avanzada imprime un documento.");
    }
    public void sendFax(){
        System.out.println("Enviando a FAX.");
    }
    public void fotocopiado(){
        System.out.println("La impresora avanzada está fotocopiando.");
    }
}

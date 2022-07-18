package Solid.ISP;


public class ImpresoraBasica implements Impresora{
    public void printDocument(){
        System.out.println("La impresora basica imprime un documento.");
    }

    public void fotocopiado(){
        System.out.println("La impresora basica está fotocopiando.");
    }
}
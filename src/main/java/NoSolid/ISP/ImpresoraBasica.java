package NoSolid.ISP;

class ImpresoraBasica implements Impresora {
    @Override
    public void printDocument() {
        System.out.println("La impresora basica imprime un documento.");
    }

    @Override
    public void sendFax(Fax faxType) {
        throw new UnsupportedOperationException();
    }
}

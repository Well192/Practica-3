package NoSolid.ISP;

interface Impresora extends Fax {
    void printDocument();

    void sendFax(Fax faxType);
}

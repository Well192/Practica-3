package NoSolid.ISP;


interface Fax {
    void sendFax(Fax faxTipe);
}
class LanFax implements Fax {
    @Override
    public void sendFax(Fax faxTipe) {

    }
}
class EFax implements Fax {
    @Override
    public void sendFax(Fax faxTipe) {

    }
}
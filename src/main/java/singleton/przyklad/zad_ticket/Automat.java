package singleton.przyklad.zad_ticket;

public class Automat implements IGeneratorTicketow {
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyMomerek();
        return GeneratorTicketow.INSTACE.pobierzNastepnyMomerek();

    }
}

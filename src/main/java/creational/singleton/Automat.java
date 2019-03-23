package creational.singleton;

public class Automat implements IGeneratorTicketow {
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyMomerek();
        return GeneratorTicketow.INSTACE.pobierzNastepnyMomerek();

    }
}

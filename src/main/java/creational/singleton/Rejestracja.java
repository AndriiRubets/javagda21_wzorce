package creational.singleton;

public class Rejestracja implements IGeneratorTicketow {
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyMomerek();
        return GeneratorTicketow.INSTACE.pobierzNastepnyMomerek();
    }
}

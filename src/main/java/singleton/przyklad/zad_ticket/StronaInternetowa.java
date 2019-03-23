package singleton.przyklad.zad_ticket;

public class StronaInternetowa implements IGeneratorTicketow{
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyMomerek();
        return GeneratorTicketow.INSTACE.pobierzNastepnyMomerek();
    }
}

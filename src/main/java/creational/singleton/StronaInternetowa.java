package creational.singleton;

public class StronaInternetowa implements IGeneratorTicketow{
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyMomerek();
        return GeneratorTicketow.INSTACE.pobierzNastepnyMomerek();
    }
}

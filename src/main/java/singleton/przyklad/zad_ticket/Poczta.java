package singleton.przyklad.zad_ticket;

public class Poczta {
    private Automat automat;
    private StronaInternetowa stronaInternetowa;
    private Rejestracja rejestracja;

    public Poczta() {
        this.automat =new Automat();
        this.stronaInternetowa = new StronaInternetowa();
        this.rejestracja = new Rejestracja();
    }

    public int pobierzTicketZAutomatu(){
        return automat.generujTicket();
    }
    public int pobierzTicketZRejestracji(){
        return rejestracja.generujTicket();
    }
    public int pobierzTicketZeStronyInternetowej(){
        return stronaInternetowa.generujTicket();
    }
}

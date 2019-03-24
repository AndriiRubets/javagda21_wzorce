package behavioral.observer;

import lombok.Data;

@Data
public class Wiadomosc {
    private String tresc;
    private int wagaWiadomosci;

    public Wiadomosc(String tresc, int wagaWiadomosci) {
        this.tresc = tresc;
        this.wagaWiadomosci = wagaWiadomosci;
    }
}

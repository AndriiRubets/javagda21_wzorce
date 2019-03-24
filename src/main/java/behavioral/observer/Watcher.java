package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private String imie;
    private int poziomPaniki;

    public Watcher(String imie, int poziomPaniki) {
        this.imie = imie;
        this.poziomPaniki = poziomPaniki;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Wiadomosc) {
            Wiadomosc wiadomosc = (Wiadomosc) arg;
            if (wiadomosc.getWagaWiadomosci() > poziomPaniki) {
                System.out.println("wpadam w panike!(" + imie + "): " + wiadomosc.getTresc());
            } else {
                System.out.println("Otrzymałem (" + imie + "): " + wiadomosc.getTresc());

            }

        }
    }
}

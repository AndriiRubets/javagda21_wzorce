package behavioral.observer;

import java.util.Observable;

public class NewsStation extends Observable {
    public void dodajOgladajacego(Watcher watcher){
        addObserver(watcher);
    }
    public void powiadomOWiadomosci(String wiadomosc,int waga){
        setChanged();
        notifyObservers(new Wiadomosc(wiadomosc,waga));
    }
}

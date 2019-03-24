package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation= new NewsStation();

        newsStation.dodajOgladajacego(new Watcher("Olek",2));
        newsStation.dodajOgladajacego(new Watcher("Peter",6));
        newsStation.dodajOgladajacego(new Watcher("Tom",4));
        newsStation.dodajOgladajacego(new Watcher("Adam",6));
        newsStation.dodajOgladajacego(new Watcher("Goerge",4));
        newsStation.dodajOgladajacego(new Watcher("Donald",7));


        newsStation.powiadomOWiadomosci("Cos sie dzieje",6);


    }
}

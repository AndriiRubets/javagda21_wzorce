package creational.singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Poczta poczta = new Poczta();

        boolean isWorking = true;
        while (isWorking) {
            String line = sc.nextLine().trim().toLowerCase();

            if (line.startsWith("quit")) {
                break;
            } else if (line.startsWith("automat")) {

                int numerek = poczta.pobierzTicketZAutomatu();
                System.out.println("Automat, ticket: "+numerek);
            } else if (line.startsWith("internet")) {
                int numerek = poczta.pobierzTicketZeStronyInternetowej();
                System.out.println("Internet, ticket: "+numerek);
            } else if (line.startsWith("rejestracja")) {
                int numerek = poczta.pobierzTicketZRejestracji();
                System.out.println("Rejestracja, ticket: "+numerek);
            }else {
                System.out.println("Wpisz jeden z variantow - automat/internet/rejestracja lub qiut");
            }
        }
    }
}

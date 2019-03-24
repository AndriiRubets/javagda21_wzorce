package behavioral.strategy.zad_cczcionka;

import behavioral.strategy.zad_cczcionka.strategies.FormatterInverter;
import behavioral.strategy.zad_cczcionka.strategies.FormatterLower;
import behavioral.strategy.zad_cczcionka.strategies.FormatterSplitter;
import behavioral.strategy.zad_cczcionka.strategies.FormatterUpper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Drukarka drukarka = new Drukarka();

        boolean isRunning = true;

        while (isRunning) {
            String line = scanner.nextLine();

            String[] words = line.split(" ", 2);

            if (line.startsWith("change")) {
                // wpisujemy komendę change na zmianę formattera, po change piszemy nazwę parsera

                String parserType = words[1];
                if (parserType.equalsIgnoreCase("upper")) {
                    drukarka.setFormatter(new FormatterUpper());
                } else if (parserType.equalsIgnoreCase("lower")) {
                    drukarka.setFormatter(new FormatterLower());
                } else if (parserType.equalsIgnoreCase("inverter")) {
                    drukarka.setFormatter(new FormatterInverter());
                }else if (parserType.equalsIgnoreCase("split")){
                    drukarka.setFormatter(new FormatterSplitter());
                }

            } else if (line.startsWith("parse")) {
                // wpisujemy komendę parse do przetworzenia tekstu, po słowie parse występuje tekst do przetworzenia.

                String tekstDoPrzetworzenia = words[1];

                System.out.println(drukarka.reformat(tekstDoPrzetworzenia));

            } else if (line.startsWith("quit")) {
                isRunning = false;
            }
        }
    }
}
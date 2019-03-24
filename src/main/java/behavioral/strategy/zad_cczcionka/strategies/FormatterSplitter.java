package behavioral.strategy.zad_cczcionka.strategies;

import behavioral.strategy.zad_cczcionka.IFormatter;

import java.util.Arrays;

public class FormatterSplitter implements IFormatter {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        String[] tablicaznakow = tekstDoZamiany.split("");
        for (int i = 0; i <tablicaznakow.length ; i++) {
            tablicaznakow[i]=tablicaznakow[i]+" ";
        }
        return Arrays.toString(tablicaznakow);
    }
}

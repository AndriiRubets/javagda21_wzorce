package behavioral.strategy.zad_cczcionka.strategies;

import behavioral.strategy.zad_cczcionka.IFormatter;

public class FormatterInverter implements IFormatter {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        char[] chars = tekstDoZamiany.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);


            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}

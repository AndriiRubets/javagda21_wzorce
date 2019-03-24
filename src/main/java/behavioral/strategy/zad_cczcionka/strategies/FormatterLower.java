package behavioral.strategy.zad_cczcionka.strategies;

import behavioral.strategy.zad_cczcionka.IFormatter;

public class FormatterLower implements IFormatter {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toLowerCase();
    }
}

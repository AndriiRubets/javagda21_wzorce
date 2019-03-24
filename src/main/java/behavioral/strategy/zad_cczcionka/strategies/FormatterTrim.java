package behavioral.strategy.zad_cczcionka.strategies;

import behavioral.strategy.zad_cczcionka.IFormatter;

public class FormatterTrim implements IFormatter {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim();
    }
}

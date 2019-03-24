package behavioral.strategy.zad_cczcionka;

public class Drukarka {
    private IFormatter formatter;

    public void setFormatter(IFormatter formatter) {
        this.formatter = formatter;
    }

    public String reformat(String tekstDoPrzetworzania){
        return formatter.zamienTekst(tekstDoPrzetworzania);
    }
}


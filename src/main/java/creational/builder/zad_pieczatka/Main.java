package creational.builder.zad_pieczatka;

public class Main {
    public static void main(String[] args) {
        Stamp.Builder builder = new Stamp.Builder();

        Stamp stampDomyslny = builder.setFirstDayNumber(0)
                .setSecondDayNumber(1)
                .setFirstMonthNumber(0)
                .setSecondMonthNumber(1)
                .setYearNumber1(2)
                .setYearNumber2(0)
                .setYearNumber3(0)
                .setYearNumber4(1)
                .setCaseNumber(0)
                .create();

        Stamp stamp1=builder.create();
        System.out.println(stampDomyslny);

        System.out.println(stamp1);
    }


}

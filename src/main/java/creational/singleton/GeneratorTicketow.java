package creational.singleton;

public enum GeneratorTicketow {
    INSTACE;

//    private static GeneratorTicketow ourInstance = new GeneratorTicketow();
//
//    public static GeneratorTicketow getInstance() {
//        return ourInstance;
//    }
//
//    private GeneratorTicketow() {
//    }

    private int numerek =1;
    public int pobierzNastepnyMomerek(){
        return numerek++;
    }
}

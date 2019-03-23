package creational.abstractfactory.zad_PC;

public class HpPC extends AbstractPC {
    public HpPC(String nazwa, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(nazwa, COMPUTER_BRAND.HP, cpu_power, gpu_power, isOverclocked);
    }
    public static AbstractPC createHPdv52() {
        return new AsusPC("dv52", 130, 57, true);
    }

    public static AbstractPC createHPdv72() {
        return new AsusPC("dv72", 145, 77, false);
    }
}

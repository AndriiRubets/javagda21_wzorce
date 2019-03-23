package creational.abstractfactory.zad_PC;

public class AsusPC extends AbstractPC {
    public AsusPC(String nazwa, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(nazwa,COMPUTER_BRAND.ASUS, cpu_power, gpu_power, isOverclocked);
    }

    public static AbstractPC createAsusN50() {
        return new AsusPC("N50", 100, 50, true);
    }

    public static AbstractPC createAsusH37() {
        return new AsusPC("N37", 80, 30, false);
    }
}

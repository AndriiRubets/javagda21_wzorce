package creational.abstractfactory.zad_PC;

public class AppleMac extends AbstractPC {

    public AppleMac(String nazwa, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(nazwa, COMPUTER_BRAND.APPLE, cpu_power, gpu_power, isOverclocked);
    }

    public static AbstractPC createAppleRetina15() {
        return new AsusPC("Retina15", 222, 180, true);
    }

    public static AbstractPC createAppleRetina17() {
        return new AsusPC("Retina17", 223, 190, false);
    }
}

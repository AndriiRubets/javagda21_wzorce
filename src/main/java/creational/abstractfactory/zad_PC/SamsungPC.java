package creational.abstractfactory.zad_PC;

public class SamsungPC extends AbstractPC {

    public SamsungPC(String nazwa,  int cpu_power, double gpu_power, boolean isOverclocked) {
        super(nazwa, COMPUTER_BRAND.SAMSUNG, cpu_power, gpu_power, isOverclocked);
    }

    public static AbstractPC createSamsungHide2() {
        return new AsusPC("Hide2", 182, 98, true);
    }

    public static AbstractPC createSamsungHide3() {
        return new AsusPC("Hide3", 145, 75, false);
    }
}

package creational.abstractfactory.zad_PC;

import lombok.Data;
import lombok.ToString;

@ToString
public abstract class AbstractPC {
    protected String nazwa;
    protected COMPUTER_BRAND computer_brand;
    protected int cpu_power;
    protected double gpu_power;
    protected boolean isOverclocked;

    public AbstractPC(String nazwa, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        this.nazwa = nazwa;
        this.computer_brand = computer_brand;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverclocked = isOverclocked;
    }
}

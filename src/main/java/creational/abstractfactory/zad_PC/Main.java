package creational.abstractfactory.zad_PC;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractPC> abstractPCs = new ArrayList<AbstractPC>();
        AbstractPC asusPC = AsusPC.createAsusH37();
        abstractPCs.add(asusPC);
        AbstractPC asusPC2 = AsusPC.createAsusN50();
        abstractPCs.add(asusPC2);

        AbstractPC hpPC = HpPC.createHPdv52();
        AbstractPC hpPC2 = HpPC.createHPdv72();

        AbstractPC samsungPC = SamsungPC.createSamsungHide2();
        AbstractPC samsungPC2 = SamsungPC.createSamsungHide3();

        AbstractPC applePC = AppleMac.createAppleRetina15();
        AbstractPC applePC2 = AppleMac.createAppleRetina17();


        abstractPCs.add(hpPC);

        System.out.println(abstractPCs);
    }
}

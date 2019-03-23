package creational.abstractfactory.zad_Bike;

public abstract class BikeFactory {
    public static Bike stworzOsobowegoKrossa5Przerzutek(){
        return new Bike("Kross",1,5,BikeType.BICYCLE);

    }
    public static Bike stworzOsobowegoMerida6Przerzutek(){
        return new Bike("Merida",1,6,BikeType.BICYCLE);

    }

    public static Bike stworzOsobowegoIniana3Przerzutek(){
        return new Bike("Iniana",2,3,BikeType.TANDEM);

    }

    public static Bike stworzOsobowegoFelt6Przerzutek(){
        return new Bike("FELT",1,6,BikeType.BICYCLE);

    }

    public static Bike stworzOsobowegoGOETZE1Przerzutek(){
        return new Bike("GOETZE",2,6,BikeType.TANDEM);

    }

}

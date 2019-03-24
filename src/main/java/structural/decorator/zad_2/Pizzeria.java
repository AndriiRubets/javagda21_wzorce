package structural.decorator.zad_2;

public abstract class Pizzeria {
    public static IPizza pizzaMargarita(){
        return new CustomPizza(new SimplePizza()).dodajDodatek("oregano");
    }
    public static IPizza pineapple(){
        return new CustomPizza(new SimplePizza()).dodajDodatek("pineapple");
    }
    public static IPizza peperoni(){
        return new CustomPizza(new SimplePizza()).dodajDodatek("peperoni");
    }
    public static IPizza quattroFormaggi(){
        return new CustomPizza(new SimplePizza()).dodajDodatek("formati").dodajDodatek("formatti");
    }

}

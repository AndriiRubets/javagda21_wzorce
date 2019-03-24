package structural.decorator.zad_2;

public class Main {
    public static void main(String[] args) {
        SimplePizza simplePizza = new SimplePizza();

        CustomPizza customPizza = new CustomPizza(simplePizza);
        customPizza.dodajDodatek("pomidor").dodajDodatek("cukini").dodajDodatek("papryke");

        System.out.println(customPizza.getIngredients());
        System.out.println(customPizza.getPrice());

        IPizza customPizza1 = Pizzeria.peperoni();
    }
}

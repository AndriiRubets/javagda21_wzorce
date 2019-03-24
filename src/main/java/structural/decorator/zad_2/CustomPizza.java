package structural.decorator.zad_2;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza implements IPizza {
    private SimplePizza simplePizza;
    private List<String> additionalIngredients=new ArrayList<>();

    public CustomPizza(SimplePizza simplePizza) {
        this.simplePizza = simplePizza;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients=new ArrayList<>(additionalIngredients);
        ingredients.addAll(simplePizza.getIngredients());
        return ingredients;
    }

    @Override
    public double getPrice() {
        return simplePizza.getPrice()+(additionalIngredients.size()*2.50);
    }

    CustomPizza dodajDodatek(String dodatek){
        additionalIngredients.add(dodatek);
        return this;
    }
}

package structural.decorator.zad_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePizza implements IPizza {
    private List<String> ingredients;

    public SimplePizza() {
        this.ingredients = new ArrayList<>(Arrays.asList("Sos","Ser"));
    }


    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return 5.0;

    }
}

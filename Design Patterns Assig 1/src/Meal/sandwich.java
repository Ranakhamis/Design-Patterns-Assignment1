package Meal;

import java.util.ArrayList;
import java.util.List;

public class sandwich implements  items
{
    public String type= new String();

    private List<ingredients> ings = new ArrayList<>();

    public void addingredients(ingredients Ingredients)
    {
        ings.add(Ingredients);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void add(items i) {

    }
}

package Meal;

public class fries extends meal_decorations
{

    @Override
    public String name()
    {
        return "fries";
    }

    @Override
    public Meal_ sandwichOnly() {
        return null;
    }

    @Override
    public Meal_ sandwich_fries() {
        return null;
    }

    @Override
    public Meal_ combo() {
        return null;
    }

    @Override
    public void add(items i) {

    }
}

package Meal;

public  class soda extends meal_decorations
{

    @Override
    public String name()
    {
        return "soda";
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

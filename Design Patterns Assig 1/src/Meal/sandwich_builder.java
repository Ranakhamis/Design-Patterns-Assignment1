package Meal;

public abstract class sandwich_builder extends meal_decorations
{
   public sandwich s = new sandwich();

    abstract void  prepareBurger();

    @Override
    public String name()
    {
        return "sandwich_builder";
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

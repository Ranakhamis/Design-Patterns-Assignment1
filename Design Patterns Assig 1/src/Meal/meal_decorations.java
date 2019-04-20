package Meal;

public abstract class  meal_decorations implements items
{
    @Override
    public String name()
    {
        return "meal_decorations";
    }

    public abstract Meal_ sandwichOnly();

    public abstract Meal_ sandwich_fries();

    public abstract Meal_ combo();
}

package Meal;

public abstract class Meal_Builder extends sandwich_builder
{
    public Meal_ m = new Meal_();

    @Override
    void prepareBurger() { }

    abstract void preparemeal();


}

package Meal;

public class meal_director
{

    Meal_Builder builder ;
    meal_director (Meal_Builder obj)
    {
        builder=obj;
    }

    public Meal_ getmeal()
    {
        builder.preparemeal();
        return builder.m;
    }
}

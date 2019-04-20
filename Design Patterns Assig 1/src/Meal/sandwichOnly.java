package Meal;

public class sandwichOnly extends Meal_Builder
{
    Meal_ m = new Meal_();

    @Override
    void preparemeal()
    {
        m.additems(s);
        if (s.type == "cheese_burger")
            System.out.println("Cheese Burger Sandwich will be prepared");

        else if (s.type=="Double_cheese_Burger")

            System.out.println("Double Cheese Burger Sandwich will be prepared");
        else
            System.out.println("Mushroom Swiss Burger Sandwich will be prepared");

    }


}

package Meal;

public class sandwich_fries extends Meal_Builder
{
    @Override
    void preparemeal()
    {
        Meal_ m = new Meal_();

        m.additems(s);
        m.additems(new fries());


        if (s.type == "cheese_Burger")
            System.out.println("Cheese Burger Sandwich and fries will be prepared");
        else if (s.type == "Double_cheese_Burger")
            System.out.println("Double Cheese Burger Sandwich and fries will be prepared");
        else
            System.out.println("Mushroom Swiss Burger Sandwich and fries will be prepared");

    }
}

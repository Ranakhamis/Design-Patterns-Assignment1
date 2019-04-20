package Meal;

public class prepareCheeseBurger extends sandwich_builder
{

    @Override
    void prepareBurger()
    {

        this.s.type="cheese_Burger";

        s.addingredients(new Lower());
        s.addingredients(new beef_patty());
        s.addingredients(new pasteurizedProcessedAmericanCheese());
        s.addingredients(new ketchup());
        s.addingredients(new pickles());
        s.addingredients(new onions());
        s.addingredients(new Upper());
        s.addingredients(new Seasoned_Mushrooms());
        s.addingredients(new fried_onions());
        s.addingredients(new Bistro_AlolI());
        s.addingredients(new upper_Artison_roll());

    }
}

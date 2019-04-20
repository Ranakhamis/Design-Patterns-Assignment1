package Meal;

public class prepareDoubleCheeseBurger extends sandwich_builder
{

    @Override
    void prepareBurger()
    {
        this.s.type= "Double_cheese_Burger";


        s.addingredients(new Lower());
        s.addingredients(new beef_patty());
        s.addingredients(new pasteurizedProcessedAmericanCheese());
        s.addingredients(new beef_patty());
        s.addingredients(new pasteurizedProcessedAmericanCheese());
        s.addingredients(new ketchup());
        s.addingredients(new pickles());
        s.addingredients(new onions());
        s.addingredients(new Upper());
    }


}

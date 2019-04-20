package Meal;

public class prepareMushroomSwissBurger extends sandwich_builder
{
    @Override
    void prepareBurger() {
        this.s.type = "Mushroom_Swiss_Burger";

        s.addingredients(new lower_Artisan_roll());
        s.addingredients(new beef_patty());
        s.addingredients(new swiss_cheese());
        s.addingredients(new Seasoned_Mushrooms());
        s.addingredients(new fried_onions());
        s.addingredients(new Bistro_AlolI());
        s.addingredients(new upper_Artison_roll());


    }
}

package Meal;

public class Builder_pattern_Demo
{
    public static void main(String[] args) {

prepareMushroomSwissBurger c =new prepareMushroomSwissBurger();
sandwich_director d= new sandwich_director(c);
sandwich s= new sandwich();
s=d.getburger();


combo o = new combo();
meal_director md= new meal_director(o);
Meal_ m=new Meal_();
m=md.getmeal();


    }

}


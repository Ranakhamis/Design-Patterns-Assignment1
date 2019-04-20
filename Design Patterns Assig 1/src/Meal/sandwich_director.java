package Meal;

public class sandwich_director
{

sandwich_builder builder ;
 sandwich_director (sandwich_builder obj)
{
    builder=obj;
}

 public sandwich getburger()
 {
     builder.prepareBurger();
     return builder.s;
 }

}

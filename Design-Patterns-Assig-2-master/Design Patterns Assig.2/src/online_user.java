

public class online_user implements stock_observer
{
    public  String Name;
    public online_user(String Name)
    {
       this.Name= Name;
    }
    public void update()
    {
        System.out.println(this.Name+" "+"Email:");
        System.out.println("The Item is back in stock");

    }
}
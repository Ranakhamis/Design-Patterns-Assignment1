public class Adapter_Observer_Patterns_Demo
{

    public static void main(String[] args)
    {
        online_portal home_page = new online_portal();
         home_page.show_("stock_market");


        stock_market_observer market = new stock_market_observer();
        stock_observer buyer = new online_user("Rana");
        stock_observer buyer2 = new online_user("Yara");
        stock_observer buyer3 = new online_user("Mostafa");
        market.addStock("item1", 12);
        market.addStock("item2", 45);
        market.NotfiyMe("item3",buyer);
        market.NotfiyMe("item3",buyer2);
        market.NotfiyMe("item4",buyer3);
        System.out.println("===== Updating item1=====");
        market.update("item3" , 13);

        System.out.println("===== Updating item2 =====");
        market.update("item4" , 46);

    }
}

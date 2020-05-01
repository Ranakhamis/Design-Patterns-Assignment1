public class inventory_adapter implements Home_page
{
private third_party_vendor vendor;

    public inventory_adapter(String type) {
    }

    public void inventory_adapter(String type)
    {

        if (type.equalsIgnoreCase("stock_market"))
        {
            third_party_vendor vendor = new stock_market();

        }
    }

    @Override
    public void buy() {

    }

    @Override
    public void show_(String type) {

            if(type.equalsIgnoreCase("stock_market")) {
                third_party_vendor.show("stock_market");
                System.out.println("println from inventory adapter show_");
                System.out.println("=========Shop Now==========");
                System.out.println("====choose category=======");
                System.out.println("clothing:");
                System.out.println("blouses // jeans // skirts // shorts ");
                System.out.println("Musical Instruments:");
                System.out.println("violin // Guitar // Harmonica ");


            }

    }


}

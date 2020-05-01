public class online_portal implements Home_page {
    private inventory_adapter inv_adp;

    @Override
    public void buy() {

    }

    @Override
    public void show_(String type) {
        if (type.equalsIgnoreCase("stock_market"))
        {
            inventory_adapter inv_adt = new inventory_adapter("stock_market");
            inv_adt.show_("stock_market");
        }
        else
            {
            System.out.println("Invalid " + type + " not supported");
            }
    }
}

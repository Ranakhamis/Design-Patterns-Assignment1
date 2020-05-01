import java.util.HashMap;
import java.util.Map;

public class stock_market implements third_party_vendor
{

    private Map<String, Integer> stockList = new HashMap<>();
    public void add_Stock_item(String item, Integer number_ofPieces_in_stock)
    {
        stockList.put(item, number_ofPieces_in_stock);
    }

    public void update(String stockSymbol, Integer num_of_items)
        {
            stockList.put(stockSymbol, num_of_items);
            notifyStockObserver(stockList);
        }

    private void notifyStockObserver(Map<String, Integer> stockList) {
    }

    @Override
    public void buy_stock(String type)
    {
         System.out.println("mn gowa buy stock l fel stock market");
    }

}

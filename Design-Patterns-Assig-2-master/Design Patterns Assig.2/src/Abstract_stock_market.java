import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Abstract_stock_market
{


    private List<stock_observer> stock_observer = new ArrayList<stock_observer>();


    public void addStock(String stockSymbol, Integer num_of_items)
    {
    System.out.println(" add stock gowa abstract stock market");

    }
    private Map<String, Integer> stockList = new HashMap<>();

    public void update(String stockSymbol, Integer num_of_items)
    {

            System.out.println("Email:");
            System.out.println("The Item is back in stock");
            stockList.put(stockSymbol, num_of_items);
            //notifyStockObserver(stockList);


    }

}

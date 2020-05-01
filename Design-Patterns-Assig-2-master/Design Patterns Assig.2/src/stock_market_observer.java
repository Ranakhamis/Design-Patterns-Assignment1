import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//stock_market de l subject lel observer pattern
public class stock_market_observer extends Abstract_stock_market
{

    private Map<String, Integer> stockList = new HashMap<>();
    private List<Pair<String , List< stock_observer>>  > NotifiedList = new ArrayList<>();
    public  void NotfiyMe(String ItemName ,stock_observer User){
        for (int i =0 ; i<NotifiedList.size();i++){

            if (NotifiedList.get(i).getKey()==ItemName)
            {
                NotifiedList.get(i).getValue().add(User);
                return;
            }
        }
        List<stock_observer > tem = new ArrayList<>();
        tem.add(User);
        NotifiedList.add(new Pair<String , List<stock_observer>> (ItemName,tem));
    }

    public void update(String stockSymbol, Integer num_of_items)
    {


        stockList.put(stockSymbol, num_of_items);
        for (int i = 0 ; i<NotifiedList.size();i++){

            if (NotifiedList.get(i).getKey()==stockSymbol)
            {
                for (int j=0 ;j<NotifiedList.get(i).getValue().size();j++)
                {
                    NotifiedList.get(i).getValue().get(j).update();
                }
                NotifiedList.remove(i);
                return;
            }
        }

    }
    private List<stock_observer> stock_observer = new ArrayList<stock_observer>();

    public void notifyStockObserver()
    {
        System.out.println("notify stock observer mn gowa stock market observer");
        for (stock_observer observer : stock_observer)
        {
            observer.update();
        }
        stock_observer.clear();

    }

}

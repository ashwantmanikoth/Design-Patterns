package L09;

import java.util.ArrayList;

public class StockListView implements StockObserver{
    private ArrayList stocks = new ArrayList();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.registerObserver(this);
    }

    public void show() {
        for (Object stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void onPriceChanged(Stock stock) {
        System.out.println("Price changed: " + stock);

    }
}

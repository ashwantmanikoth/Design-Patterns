package L09;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private float price;
    private List<StockObserver> observers = new ArrayList<>();


    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.onPriceChanged(this);
        }
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();

    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    public void registerObserver(StockObserver stockObserver) {
    observers.add(stockObserver);
    }

    public void deregister(StockObserver stockObserver){
        observers.remove(stockObserver);
    }
}

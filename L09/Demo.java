package L09;

public class Demo {

  public static void main(String[] args) {

    Stock apple = new Stock("Apple", 123.45f);
    Stock google = new Stock("GOOGLE", 678.90f);

    // create views
    StatusBar statusBar = new StatusBar();
    StockListView stockListView = new StockListView();

    // add stocks to views
    statusBar.addStock(apple);
    statusBar.addStock(google);
    stockListView.addStock(apple);

    // display initial state of views
    System.out.println("Initial state:");
    statusBar.show();
    stockListView.show();
    System.out.println("Updated state:");

    apple.setPrice(130.00f);
    google.setPrice(700.00f);

    statusBar.show();
    stockListView.show();

  }
}

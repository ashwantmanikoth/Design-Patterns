package L06.flyweight;

public class Demo {
  public static void show() {
    SpreadSheet sheet = new SpreadSheet();
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
  public static void main(String args[]){
    show();
  }
}

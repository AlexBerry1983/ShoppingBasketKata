import java.util.*;

public class ShoppingBasket {

  ArrayList<Item>contents;

  public ShoppingBasket() {
    this.contents = new ArrayList<Item>();
  }

  public int countItems() {
    return this.contents.size();
  }


}

import java.util.*;

public class ShoppingBasket {

  ArrayList<Item>contents;

  public ShoppingBasket() {
    this.contents = new ArrayList<Item>();
  }

  public int countItems() {
    return this.contents.size();
  }

  public void addItem(Item item) {
    this.contents.add(item);
  }

  public void removeItem(int index) {
    this.contents.remove(index);
  }

  public Item findItem(int index) {
    return this.contents.get(index);
  }


}

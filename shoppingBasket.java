import java.util.*;


public class ShoppingBasket {

  ArrayList<Item>contents;

  public ShoppingBasket() {
    this.contents = new ArrayList<Item>();
  }

  public ArrayList<Item> getContents() {
    return this.contents;
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

  public void empty() {
    this.contents.clear();
  }

  // public long getTotalPrice(Customer customer) {
  //   long total = 0;
  //     for (Item item : this.contents) {
  //       total += item.getPrice();
  //     }
  //       if (total >= 2000) {
  //         total -= (total * 0.1);
  //       }
  //         if (customer.hasLoyaltyCard() == true) {
  //           total -= (total * 0.02);
  //         }
  //     return total;
  // }


}

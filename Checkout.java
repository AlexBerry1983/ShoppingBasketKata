import java.util.*;

public class Checkout {

  public long getShoppingBasketPrice(ShoppingBasket basket, Customer customer) {
    long total = 0;
      for (Item item : basket.getContents()) {
        total += item.getPrice();
      }
        if (total >= 2000) {
          total -= (total * 0.1);
        }
          if (customer.hasLoyaltyCard() == true) {
            total -= (total * 0.02);
          }
      return total;
  }

  public Arraylist<Item> getBogofItems(ShoppingBasket basket, Item searchedForItem) {
    ArrayList<Item> bogofItems = new ArrayList<Item>();
    for (Item item : basket.getContents()) {
      if (item.getDescription().equals(searchedForItem.getDescription()) && (item.getBogofStatus() == searchedForItem.getBogofStatus())) {
        bogofItems.add(item);
      }
    }
    return bogofItems;
  }

  // public boolean getMatchingBogofItems(ShoppingBasket basket, Item searchedForItem) {
  //   boolean result = false;
  //     for (Item item : basket.getContents()) {
  //       if (item.getBogofStatus() == searchedForItem.getBogofStatus()) {
  //         result = true;
  //       }
  //     }
  //   return result;
  // }


}

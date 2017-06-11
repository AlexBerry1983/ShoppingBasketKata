import static org.junit.Assert.*;
import org.junit.*;

public class CheckoutTest {

  @Test
  public void canGetBasketPrice() {
    Checkout checkout = new Checkout();
    Customer customer = new Customer(false);
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100, false);
    Item item2 = new Item("rice", 150, false);
    basket.addItem(item);
    basket.addItem(item2);
    assertEquals(250, checkout.getShoppingBasketPrice(basket, customer));
  }

  @Test
  public void canReduceBasketPriceByTenPercent() {
    Checkout checkout = new Checkout();
    Customer customer = new Customer(false);
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("wine", 1000, false);
    Item item2 = new Item("whisky", 1500, false);
    basket.addItem(item);
    basket.addItem(item2);
    assertEquals(2250, checkout.getShoppingBasketPrice(basket, customer));
  }

  // @Test
  // public void customerLoyaltyDiscount() {
  //   Customer customer = new Customer(true);
  //   ShoppingBasket basket = new ShoppingBasket();
  //   Item item = new Item("wine", 1000, false);
  //   Item item2 = new Item("whisky", 1500, false);
  //   basket.addItem(item);
  //   basket.addItem(item2);
  //   assertEquals(2205, basket.getTotalPrice(customer));
  // }
}

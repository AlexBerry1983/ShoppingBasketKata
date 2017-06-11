import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest {

  @Test
  public void checkStartsEmpty() {
    ShoppingBasket basket = new ShoppingBasket();
    assertEquals(0, basket.countItems());
  }

  @Test
  public void canAddItems() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100);
    basket.addItem(item);
    assertEquals(1, basket.countItems());
  }

  @Test
  public void canRemoveItem() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100);
    basket.addItem(item);
    basket.removeItem(0);
    assertEquals(0, basket.countItems());
  }

  @Test
  public void canRemoveSecondItem() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100);
    Item item2 = new Item("rice", 150);
    Item item3 = new Item("pizza", 550);
    basket.addItem(item);
    basket.addItem(item2);
    basket.addItem(item3);
    basket.removeItem(1);
    assertEquals(2, basket.countItems());
  }

}

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

}

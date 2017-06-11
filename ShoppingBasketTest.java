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
    Item item = new Item("peas", 100, false);
    basket.addItem(item);
    assertEquals(1, basket.countItems());
  }

  @Test
  public void canRemoveItem() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100, false);
    basket.addItem(item);
    basket.removeItem(0);
    assertEquals(0, basket.countItems());
  }

  @Test
  public void canRemoveSecondItem() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100, false);
    Item item2 = new Item("rice", 150, false);
    Item item3 = new Item("pizza", 550, false);
    basket.addItem(item);
    basket.addItem(item2);
    basket.addItem(item3);
    basket.removeItem(1);
    assertEquals(2, basket.countItems());
  }

  @Test
  public void canFindItemDescription() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100, false);
    Item item2 = new Item("rice", 150, false);
    basket.addItem(item);
    basket.addItem(item2);
    assertEquals(item2, basket.findItem(1));
  }

  @Test
  public void canEmptyBasket() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("peas", 100, false);
    Item item2 = new Item("rice", 150, false);
    basket.addItem(item);
    basket.addItem(item2);
    basket.empty();
    assertEquals(0, basket.countItems());
  }

  @Test
  public void canGetContentsOfBasket() {
    ShoppingBasket basket = new ShoppingBasket();
    assertEquals(0, basket.getContents().size());
  }

  @Test
  public void canGetWholeBasket() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("wine", 1000, false);
    Item item2 = new Item("whisky", 1500, false);
    basket.addItem(item);
    basket.addItem(item2);
    assertEquals(2, basket.getContents().size());
  }

  @Test
  public void canCountMatchingItemsInBasket() {
    ShoppingBasket basket = new ShoppingBasket();
    Item item = new Item("wine", 900, false);
    Item item2 = new Item("wine", 900, false);
    Item item3 = new Item("whisky", 1500, false);
    basket.addItem(item);
    basket.addItem(item2);
    basket.addItem(item3);
    assertEquals(2, basket.getMatchingItems(item));
  }
}

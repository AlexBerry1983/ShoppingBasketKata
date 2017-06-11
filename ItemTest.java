import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

  @Test
  public void canGetItemDescription() {
    Item item = new Item("peas", 100, false);
    assertEquals("peas", item.getDescription());
  }

  @Test
  public void canGetItemPrice() {
    Item item = new Item("peas", 100, false);
    assertEquals(100, item.getPrice());
  }

  @Test
  public void canGetBogofStatus() {
    Item item = new Item("peas", 100, false);
    assertEquals(false, item.getBogofStatus());
  }


}

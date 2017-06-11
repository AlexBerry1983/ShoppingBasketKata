import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

  @Test
  public void canGetItemDescription() {
    Item item = new Item("peas", 100);
    assertEquals("peas", item.getDescription());
  }

  @Test
  public void canGetItemPrice() {
    Item item = new Item("peas", 100);
    assertEquals(100, item.getPrice());
  }


}

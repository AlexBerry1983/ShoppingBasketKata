import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

  @Test
  public void canGetItemDescription() {
    Item item = new Item("peas");
    assertEquals("peas", item.getDescription());
  }

}

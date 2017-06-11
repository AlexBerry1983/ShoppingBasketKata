import static org.junit.Assert.*;
import org.junit.*;

public class CustomerTest {

  @Test
  public void checkForLoyaltyCard() {
  Customer customer = new Customer(true);
  assertEquals(true, customer.hasLoyaltyCard());
  }


}

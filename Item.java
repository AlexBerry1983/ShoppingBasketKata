public class Item {

  private String description;
  private long price;
  private boolean bogof;

  public Item(String description, int price, boolean bogof) {
    this.description = description;
    this.price = price;
    this.bogof = bogof;
  }

  public String getDescription() {
    return this.description;
  }

  public long getPrice() {
    return this.price;
  }

  public boolean getBogofStatus() {
    return this.bogof;
  }

}

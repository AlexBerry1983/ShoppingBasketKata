public class Item {

  private String description;
  private int price;
  private boolean bogof;

  public Item(String description, int price, boolean bogof) {
    this.description = description;
    this.price = price;
    this.bogof = bogof;
  }

  public String getDescription() {
    return this.description;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean getBogofStatus() {
    return this.bogof;
  }

}

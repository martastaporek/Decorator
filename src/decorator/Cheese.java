package decorator;

/**
 *Dodatek do pizzy - topping
 */
public class Cheese extends ToppingDecorator {

  private String ingredient = "ser, ";
  private double price = 2.0;

  public Cheese(Pizza basePizza) {
    super(basePizza);
  }

  @Override
  public String getIngredients() {
    return super.getIngredients() + this.ingredient;
  }

  @Override
  public double getPrice() {
    return super.getPrice() + this.price;
  }
}

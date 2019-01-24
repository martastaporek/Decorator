package decorator;

/**
 * Abstrakcyjny dodatek do pizzy
 */
public abstract class ToppingDecorator implements Pizza {

  private Pizza basePizza;

  ToppingDecorator(Pizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public String getIngredients() {
    return basePizza.getIngredients();
  }

  @Override
  public double getPrice() {
    return basePizza.getPrice();
  }
}

package decorator;

/*
** Zwykła pizza tylko z sosem pomodorowym
 */
public class BasicPizza implements Pizza {

  private String ingredients = "Sos pomidorowy, ";
  private double price = 20.0;

  @Override
  public String getIngredients() {
    return this.ingredients;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}

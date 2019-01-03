package inheritence;

public abstract class Pizza {

  private String ingredients;
  private double price;

  public Pizza(String ingredients, double price) {
    this.ingredients = ingredients;
    this.price = price;
  }

  public String getIngredients() {
    return ingredients;
  }

  public double getPrice() {
    return price;
  }
}

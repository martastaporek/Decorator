package inheritence;

/**
* Inna klasa dla kazdego rodzaju pizzy, za każdym razem trzeba osobno liczyć cene pizzy
 */
public class CheesePizza extends Pizza {
  public CheesePizza(String ingredients, double price) {
    super(ingredients, price);
  }
}

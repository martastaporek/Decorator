package decorator;

public class Main {

  public static void main(String[] args) {
    Pizza myPizza = new Cheese(new BasicPizza());
    System.out.println(myPizza.getIngredients());
    System.out.println(myPizza.getPrice());

  }
}

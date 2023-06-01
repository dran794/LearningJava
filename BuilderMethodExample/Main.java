package BuilderMethodExample;

// Product class
class Burger {
  private String patty;
  private String cheese;
  private String toppings;
  private String condiments;

  public void setPatty(String patty) {
    this.patty = patty;
  }

  public void setCheese(String cheese) {
    this.cheese = cheese;
  }

  public void setToppings(String toppings) {
    this.toppings = toppings;
  }

  public void setCondiments(String condiments) {
    this.condiments = condiments;
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////

  public String getDescription() {
    return "Burger with " + patty + " patty, " + cheese + ", " + toppings + ", and " + condiments;
  }
}

// Builder interface
interface BurgerBuilder {
  void addPatty(String patty);

  void addCheese(String cheese);

  void addToppings(String toppings);

  void addCondiments(String condiments);

  Burger build();
}

// ********************************************************************************************** */
// Concrete builder class
class CustomBurgerBuilder implements BurgerBuilder {
  private Burger burger;

  public CustomBurgerBuilder() {
    burger = new Burger();
  }

  @Override
  public void addPatty(String patty) {
    burger.setPatty(patty);
  }

  @Override
  public void addCheese(String cheese) {
    burger.setCheese(cheese);
  }

  @Override
  public void addToppings(String toppings) {
    burger.setToppings(toppings);
  }

  @Override
  public void addCondiments(String condiments) {
    burger.setCondiments(condiments);
  }

  @Override
  public Burger build() {
    return burger;
  }
}

/*********************************************************************************/
// Director class
class BurgerDirector {
  public Burger constructBurger(BurgerBuilder builder) {
    builder.addPatty("beef");
    builder.addCheese("cheddar");
    builder.addToppings("lettuce, tomato, onion");
    builder.addCondiments("ketchup, mayo");

    return builder.build();
  }
}

/************************************************************************** */
// Client code
public class Main {
  public static void main(String[] args) {
    BurgerBuilder builder = new CustomBurgerBuilder();
    BurgerDirector director = new BurgerDirector();

    Burger burger = director.constructBurger(builder);
    System.out.println(burger.getDescription());
  }
}

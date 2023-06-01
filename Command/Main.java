package Command;

// Command interface
interface OrderCommand {
  void execute();
}

// Receiver class
class Chef {
  private String dish;

  public void setDish(String dish) {
    this.dish = dish;
  }

  public void cook() {
    System.out.println("Cooking " + dish);
  }
}

// Concrete command classes
class OrderDishCommand implements OrderCommand {
  private Chef chef;
  private String dish;

  public OrderDishCommand(Chef chef, String dish) {
    this.chef = chef;
    this.dish = dish;
  }

  @Override
  public void execute() {
    chef.setDish(dish);
    chef.cook();
  }
}

// Invoker class
class Waiter {
  private OrderCommand command;

  public void setCommand(OrderCommand command) {
    this.command = command;
  }

  public void submitOrder() {
    command.execute();
  }
}

// Client code
public class Main {
  public static void main(String[] args) {
    Chef chef = new Chef();
    OrderCommand orderCommand = new OrderDishCommand(chef, "Pasta");

    Waiter waiter = new Waiter();
    waiter.setCommand(orderCommand);
    waiter.submitOrder(); // Output: Cooking Pasta
  }
}

package FactoryMethod;

// Product interface
interface Toy {
  void play();
}

// Concrete product classes
class ToyCar implements Toy {
  @Override
  public void play() {
    System.out.println("Driving the toy car!");
  }
}

class ToyRobot implements Toy {
  @Override
  public void play() {
    System.out.println("Controlling the toy robot!");
  }
}

// ToyFactory class acts as the factory
class ToyFactory {
  // Factory method to create toys
  public Toy createToy(String toyType) {
    if (toyType.equalsIgnoreCase("car")) {
      return new ToyCar();
    } else if (toyType.equalsIgnoreCase("robot")) {
      return new ToyRobot();
    } else {
      return null; // Handle unknown toy types
    }
  }
}

// Client code
public class FactoryPatternExample {
  public static void main(String[] args) {
    ToyFactory toyFactory = new ToyFactory();

    // Creating a toy car using the factory
    Toy toyCar = toyFactory.createToy("car");
    toyCar.play(); // Output: Driving the toy car!

    // Creating a toy robot using the factory
    Toy toyRobot = toyFactory.createToy("robot");
    toyRobot.play(); // Output: Controlling the toy robot!
  }
}

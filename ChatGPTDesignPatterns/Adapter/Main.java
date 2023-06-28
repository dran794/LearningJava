package Adapter;

// Client code
public class Main {
  public static void main(String[] args) {
    ForeignPlug foreignPlug = new ForeignWallPlug();
    HomePlug homePlug = new ForeignToHomePlugAdapter(foreignPlug);

    homePlug.plugIntoHomeOutlet(); // Output: Plugged into foreign outlet
  }
}

// Adaptee interface
interface ForeignPlug {
  void plugIntoForeignOutlet();
}

// Adaptee class
class ForeignWallPlug implements ForeignPlug {
  @Override
  public void plugIntoForeignOutlet() {
    System.out.println("Plugged into foreign outlet");
  }
}

// Target interface
interface HomePlug {
  void plugIntoHomeOutlet();
}

// Adapter class
class ForeignToHomePlugAdapter implements HomePlug {
  private ForeignPlug foreignPlug;

  public ForeignToHomePlugAdapter(ForeignPlug foreignPlug) {
    this.foreignPlug = foreignPlug;
  }

  @Override
  public void plugIntoHomeOutlet() {
    foreignPlug.plugIntoForeignOutlet();
  }
}

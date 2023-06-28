package Prototype;

// Prototype interface
interface Painting {
  Painting createCopy();

  void display();
}

// Concrete prototype class
class LandscapePainting implements Painting {
  private String title;

  public LandscapePainting(String title) {
    this.title = title;
  }

  public Painting createCopy() {
    return new LandscapePainting(this.title);
  }

  public void display() {
    System.out.println("Displaying landscape painting: " + title);
  }
}

// Client code
public class Main {
  public static void main(String[] args) {
    Painting originalPainting = new LandscapePainting("Sunset");
    Painting clonedPainting = originalPainting.createCopy();

    originalPainting.display(); // Output: Displaying landscape painting: Sunset
    clonedPainting.display(); // Output: Displaying landscape painting: Sunset
  }
}

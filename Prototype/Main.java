package Prototype;

// Prototype interface
interface Shape extends Cloneable {
  void draw();

  Shape clone();
}

// Concrete prototype classes
class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }

  @Override
  public Shape clone() {
    try {
      return (Shape) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }

  @Override
  public Shape clone() {
    try {
      return (Shape) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

// Client code
public class Main {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Shape clonedRectangle = rectangle.clone();
    rectangle.draw(); // Output: Drawing a rectangle
    clonedRectangle.draw(); // Output: Drawing a rectangle

    Shape circle = new Circle();
    Shape clonedCircle = circle.clone();
    circle.draw(); // Output: Drawing a circle
    clonedCircle.draw(); // Output: Drawing a circle
  }
}

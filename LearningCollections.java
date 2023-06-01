import java.util.HashSet;
import java.util.Set;

public class LearningCollections {

  public static void main(String[] args) {
    Set<Integer> numbers1 = new HashSet<Integer>();
    Set<Integer> numbers2 = new HashSet<Integer>();

    numbers1.add(45);
    numbers1.add(520);
    numbers2.add(69);
    numbers2.add(45);
    numbers2.add(520);

    System.out.println(numbers1.equals(numbers2));

    // This doesn't actually work, but it should be true
    System.out.println(numbers2.contains(numbers1));
  }
}

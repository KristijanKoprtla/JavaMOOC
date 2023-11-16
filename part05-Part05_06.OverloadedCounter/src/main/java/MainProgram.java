
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(5);
        System.out.println(counter);
        counter.increase(10);
        counter.decrease();
        System.out.println(counter);
    }
}

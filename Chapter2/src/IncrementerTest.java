class Incrementer {
    int count = 0;

    public void increment() {
        count += 1;
    }

    public void total() {
        System.out.println(count);
    }
}

public class IncrementerTest {
    public static void main(String[] args) {
        Incrementer inc = new Incrementer();
	    for (int i = 0; i < 5; i++) {
            inc.increment();
        }
        inc.total();
    }
}

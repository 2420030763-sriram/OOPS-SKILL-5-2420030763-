package skill5;

class FinalDemo {
    // Blank final variable
    private final int number;

    // Constructor to initialize the blank final variable
    public FinalDemo(int number) {
        this.number = number;
    }

    // Final method — cannot be overridden
    public final void showNumber() {
        System.out.println("The number is: " + number);
    }
}

public class Finalclass { // Must match file name exactly
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo(100);
        obj.showNumber();
    }
}

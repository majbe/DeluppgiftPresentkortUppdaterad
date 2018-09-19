import java.util.Arrays;

public class Test {
    //Kör igång testet för presentkoortet och skapar ett nytt presentkort
    public static void main(String[] args) {
        Presentkort presentkort = new Presentkort("5555 5555 5555 5555");
        presentkort.run(presentkort);
    }
}
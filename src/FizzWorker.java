public class FizzWorker implements Runnable {
    int i;
    String text;

    public FizzWorker(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if (i % 15 == 0) {
            text = "FizzBuzz";
        }
        else if (i % 3 == 0) {
            text ="Fizz";
        }
        else if (i % 5 == 0) {
            text ="Buzz";
        }
        else {
            text = Integer.toString(i);
        }
        text.chars().mapToObj(i -> (char)i).forEach(System.out::print);
        System.out.print("\n");
    }
}

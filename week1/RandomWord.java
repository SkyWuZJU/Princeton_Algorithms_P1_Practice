// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
import java.util.Random;

public class RandomWord {
    public static String select_rand(String[] input) {
        String champion = input[0];
        Integer length = input.length;
        Random rand = new Random();
        for (int i = 1; i < length+1; i++) {
            double randomNum = rand.nextInt(i+1); // Create a random num between 0 and i
            if (i-1<randomNum) { // The prob of True is 1/i
                champion = input[i-1];
            }
        }
        return champion;
    }
    public static void main(String[] args) {
        System.out.println(select_rand(args));;
    }
}
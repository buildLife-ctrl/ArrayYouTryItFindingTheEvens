import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] num = {3, 4, 7, 6, 2, 8 , 9, 4, 5, 1};
        for (int x : num) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}

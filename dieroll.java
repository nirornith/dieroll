import java.util.Random;
import java.util.Scanner;

public class dieroll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        dieroll die = new dieroll();

        System.out.println("What kind of die do you want to roll?");
        System.out.println("");
        System.out.println("D4 [4], D6 [6], D8 [8], D10 [10], D12 [12], D20 [20]");
        int input = s.nextInt();

        if (input == 4) {
            die.d4();
        } else if (input == 6) {
            die.d6();
        } else if (input == 8) {
            die.d8();
        } else if (input == 10) {
            die.d10();
        } else if (input == 12) {
            die.d12();
        } else if (input == 20) {
            die.d20();
        } else {
            System.out.println("That is not a valid input");
        }
        s.close();
    }

    private void d4() {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        System.out.println("Your result: " + n);
    }

    private void d6() {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        System.out.println("Your result: " + n);
    }

    private void d8() {
        Random rand = new Random();
        int n = rand.nextInt(8) + 1;
        System.out.println("Your result: " + n);
    }

    private void d10() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        System.out.println("Your result: " + n);
    }

    private void d12() {
        Random rand = new Random();
        int n = rand.nextInt(12) + 1;
        System.out.println("Your result: " + n);
    }

    private void d20() {
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        System.out.println("Your result: " + n);
    }
}
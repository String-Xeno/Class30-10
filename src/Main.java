import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println("how long is the number?");
        Scanner input = new Scanner(System.in);
        //int timestorepeat = input.nextInt();
        System.out.println("what is the number?");
        int num = input.nextInt();
        int temp;
        int num1 = 0;
        //originally used for loop but after doing so i was told to also solve using while
        while (num%10 > 0) {
            temp = num % 10;
            num1 = num1*10 + temp;
            num = num/10;
        }
        System.out.println(num1);
    }
}

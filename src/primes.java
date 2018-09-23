import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int val = scan.nextInt();
            boolean number = false;
        for (int i = 2; i < val ; i++) {
            if (val%i == 0){
                number = true;
                break;
            }

        }
                if(number)
                    System.out.println(val + "- это число не простое, попробуйте сново");
                else
                    System.out.println(val + "-это число простое");
    }
}

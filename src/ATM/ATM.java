package ATM;

public class ATM {

    private static int denomination20;
    private static int denomination50;
    private static int denomination100;

    public static void addMoney(int add20, int add50,int add100){

        denomination20 += add20;
        denomination50 += add50;
        denomination100 += add100;
    }
    static void askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, pleas enter correct sum");
        } else {
            boolean firstAnswer;
            if (denomination100 * 100 + denomination50 * 50 + denomination20 * 20 >= requestCash) {
                firstAnswer = true;

            } else {
                firstAnswer = false;
                System.out.println("not enough money");
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Welcome to the Crackle Pop Indicator");
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        CracklePop cracklePop = new CracklePop();
        System.out.println("Result : " + cracklePop.cracklePopMethod(n));
        scanner.close();
    }


}

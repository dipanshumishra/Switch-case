import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick one : 1. Hi\t2. Hey\t3. Hello");
        int choice=scan.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("You said Hi");
                break;
            case 2:
                System.out.println("You said Hey");
                break;
            case 3:
                System.out.println("You said Hello");
                break;
            default:
                System.out.println("Invalid Choice");


        }


    }
}

package checkpoint2;
import java.util.Scanner;
public class userInteraction {
    public static void  printMenu(){
        System.out.println("Please enter one of the following options:");
        System.out.println("1. Rent equipment");
        System.out.println("2. Return Equipment");
        System.out.println("3. Equipment Delivery");
        System.out.println("4. Equipment Pickup");
        userChoice();
    }

    static void userChoice(){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                rentEquip();
                break;
            case 2:
                returnEquip();
                break;
            case 3:
                equipDeliver();
                break;
            case 4:
                equipPickup();
                break;
            default:
                System.out.println("Error: Invalid input, try again!");
                printMenu();
                userChoice();
                break;
        }
    }

    static void rentEquip(){
        System.out.println("Equipment Rented!");
    }

    static void returnEquip(){
        System.out.println("Equipment Returned!");
    }

    static void equipDeliver(){
        System.out.println("Equipment Delivered!");
    }

    static void equipPickup(){
        System.out.println("Equipment Picked Up!");
    }
}

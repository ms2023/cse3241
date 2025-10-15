package checkpoint2;
import java.util.Scanner;
public class userInteraction {
    public static int  printMenu(){
        System.out.println("Please enter one of the following options:");
        System.out.println("1. Rent equipment");
        System.out.println("2. Return Equipment");
        System.out.println("3. Equipment Delivery");
        System.out.println("4. Equipment Pickup");
        userChoice();
        return(0);
    }

    static int userChoice(){
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
        return(0);
    }

    static int rentEquip(){
        System.out.println("Equipment Rented!");
        return(0);
    }

    static int returnEquip(){
        System.out.println("Equipment Returned!");
        return(0);
    }

    static int equipDeliver(){
        System.out.println("Equipment Delivered!");
        return(0);
    }

    static int equipPickup(){
        System.out.println("Equipment Picked Up!");
        return(0);
    }
}

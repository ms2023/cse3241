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
                rentEquip(in);
                break;
            case 2:
                returnEquip(in);
                break;
            case 3:
                equipDeliver(in);
                break;
            case 4:
                equipPickup(in);
                break;
            default:
                System.out.println("Error: Invalid input, try again!");
                printMenu();
                userChoice();
                break;
        }
        return(0);
    }

    static int rentEquip(Scanner in){
        System.out.println("Please enter the Rental Number: ");
        String rNum = in.nextLine();
        System.out.println("Please enter the Customer Id: ");
        String cID = in.nextLine();
        System.out.println("Please enter the Equipment Serial Number: ");
        String sNum = in.nextLine();
        System.out.println("Please enter the Rental Date: ");
        int rDate = in.nextInt();
        System.out.println("Please enter the Due Date: ");
        int dDate = in.nextInt();
        System.out.println("Please enter the Fee: ");
        int fee = in.nextInt();
        System.out.println("Equipment Rented!");
        return(0);
    }

    static int returnEquip(Scanner in){
        System.out.println("Please enter the Rental Number: ");
        String rNum = in.nextLine();
        System.out.println("Please enter the Date of Return: ");
        int doR = in.nextInt();
        System.out.println("Equipment Returned!");
        return(0);
    }

    static int equipDeliver(Scanner in){
        System.out.println("Please enter the Rental Number: ");
        int rNum = in.nextInt();
        System.out.println("Please enter the Drone Serial Number : ");
        int dsNum = in.nextInt();
        System.out.println("Please enter the Date of Arrival: ");
        int doA = in.nextInt();
        System.out.println("Equipment Delivered!");
        return(0);
    }

    static int equipPickup(Scanner in){
        System.out.println("Please enter the Rental Number: ");
        int rNum = in.nextInt();
        System.out.println("Please enter the Drone Serial Number : ");
        int dsNum = in.nextInt();
        System.out.println("Please enter the Date of Pickup: ");
        int doPU = in.nextInt();
        System.out.println("Equipment Picked Up!");
        return(0);
    }
}


import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] roomTypes = {"Standard", "Economy", "Deluxe"};
        String[][] rooms = {{"Available", "Available", "Available", "Available", "Available"},
                            {"Available", "Available", "Available", "Available", "Available"},
                            {"Available", "Available", "Available", "Available", "Available"}};
        double[] roomPrices = {100.0, 50.0, 200.0};
        
        System.out.println("Welcome to Programmers Paradigm Hotel Reservation System!");
        
        while (true) {
            System.out.println("\nRoom Types:");
            for (int i = 0; i < roomTypes.length; i++) {
                System.out.println(roomTypes[i] + " Rooms: " + "php" +roomPrices[i] + "/hour");
                for (int j = 0; j < rooms[i].length; j++) {
                    System.out.println(roomTypes[i].substring(0, 1) + (j+1) + " (" + rooms[i][j] + ") ");
                }
                System.out.println();
            }
            
            System.out.print("\nPlease select a room: ");
            String roomSelection = sc.nextLine().toUpperCase();
            int roomTypeIndex = -1;
            int roomNumber = -1;
            
            for (int i = 0; i < roomTypes.length; i++) {
                if (roomSelection.startsWith(roomTypes[i].substring(0, 1))) {
                    roomTypeIndex = i;
                    roomNumber = Integer.parseInt(roomSelection.substring(1));
                    break;
                }
            }
            
            if (roomTypeIndex == -1 || roomNumber == -1 || roomNumber < 1 || roomNumber > 5) {
                System.out.println("Invalid selection, please try again.");
                continue;
            }
            
            if (!rooms[roomTypeIndex][roomNumber - 1].equals("Available")) {
                System.out.println("Sorry, that room is not available. Please select another.");
                continue;
            }
            
            System.out.print("Please enter your name: ");
            String name = sc.nextLine();
            
            System.out.println("Room selected: " + roomTypes[roomTypeIndex] + " Room " + roomNumber + " (Price per hour: php" + roomPrices[roomTypeIndex] + ")");
            System.out.println("Reserved by: " + name);
            rooms[roomTypeIndex][roomNumber - 1] = name;
            
            System.out.print("Would you like to make another reservation? (Y/N): ");
            String continueChoice = sc.nextLine().toUpperCase();
            if (continueChoice.equals("N")) {
                break;
            }
        }
        
        System.out.println("Thank you for using our Programmers Paradigm Hotel Reservation System!");
        sc.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        guests[0] = "Raza";
        guests[1] = "Kary";
        guests[2] = "Andrea";
        guests[3] = "Angelica";
        guests[4] = "Sarah";

        do {
            displayGuests(guests);

            System.out.println("________________________________\n\n - Menu -\n");
            System.out.println("1 - Add Guest");
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                    System.out.print("Name: ");
                    String name = scanner.next();
                    guests[i] = name;
                    break;
                } 
            }
        }
            else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if (option == 3) {
                break;
            }
        } while (true);
        System.out.println("Exiting...");
    }

    public static void displayGuests(String[] guestList) {
          System.out.println("________________________________\n\n - Guests -\n");
            for (int i = 0; i < guestList.length; i++) {
                System.out.println((guestList[i] != null) ? guestList[i] : "--"); 
            }
    }
}

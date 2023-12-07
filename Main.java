import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = new String[10];

        guests[0] = "Raza";
        guests[1] = "Kary";
        guests[2] = "Andrea";
        guests[3] = "Angelica";
        guests[4] = "Sarah";

        do {
            displayGuests(guests);

            int option = displayMenu(scanner);

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
                String[] temp = new String[guests.length];
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
                int ti = 0;
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null) {
                        temp[ti] = guests[i];
                        ti++;
                    }
                }
                guests = temp;
            }
            else if (option == 3) {
                break;
            }
        } while (true);
        System.out.println("Exiting...");
    }

    public static void displayGuests(String[] guestList) {
          System.out.println("________________________________\n\n - Guests -\n");
          boolean isEmpty = true;
         
            for (int i = 0; i < guestList.length; i++) {
                if (guestList[i] != null) {
                    isEmpty = false;
                    System.out.println((i + 1)+"." + " " +  guestList[i]);
                }
            }
            if (isEmpty) {
                System.out.println("Guest list is empty.");
            }
    }

    public static int displayMenu(Scanner scanner) {

            System.out.println("________________________________\n\n - Menu -\n");
            System.out.println("1 - Add Guest");
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");
            System.out.print("Option: ");
            return scanner.nextInt();
    }
}

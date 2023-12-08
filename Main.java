import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = new String[10];

        insertTestNames(guests);

        do {
            displayGuests(guests);

            int option = displayMenu(scanner);

            if (option == 1) {
               addGuest(guests, scanner);
            }   
        
            else if (option == 2) {
                 guests = removeGuest(guests, scanner);
            
             } else if (option == 3) {
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

    public static void addGuest(String[] guestList, Scanner scanner) {
         for (int i = 0; i < guestList.length; i++) {
                    if (guestList[i] == null) {
                    System.out.print("Name: ");
                    String name = scanner.next();
                    guestList[i] = name;
                    break;
                }
         } 
    }

    public static String[] removeGuest(String[] guestList, Scanner scanner) {
        String[] temp = new String[guestList.length];
                System.out.print("Number: ");
                int number = scanner.nextInt();
                if (number < 1 || number > 10) {
                    System.out.println("Error: There is no guest with that number.");
                }
                for (int i = 0; i < guestList.length; i++) {
                    if (guestList[i] != null && (i + 1) == number) {
                        guestList[i] = null;
                        break;
                    }
                }
                int ti = 0;
                for (int i = 0; i < guestList.length; i++) {
                    if (guestList[i] != null) {
                        temp[ti] = guestList[i];
                        ti++;
                    }
                }
                return temp;
    }

    public static void insertTestNames(String[] guestList) {
        guestList[0] = "Raza";
        guestList[1] = "Kary";
        guestList[2] = "Andrea";
        guestList[3] = "Angelica";
        guestList[4] = "Sarah";
    }
}


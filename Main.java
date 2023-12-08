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
               guests = addGuest(guests, scanner);
            }   
        
            else if (option == 2) {
                 guests = removeGuest(guests, scanner);
            
             } 
             else if (option == 3) {
                guests = renameGuest(guests, scanner);
             }
             else if (option == 4) {
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
            System.out.println("3 - Rename Guest");
            System.out.println("4 - Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            return option;
    }

    public static String[] addGuest(String[] guestList, Scanner scanner) {
         for (int i = 0; i < guestList.length; i++) {
                    if (guestList[i] == null) {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Would you like to put the guest in a particular position? (Y/N): ");
                    String response = scanner.next();
                    if (response.equals("N")) {
                        guestList[i] = name;
                    } else {
                        System.out.println("Select a position: ");
                        int position = scanner.nextInt();
                        scanner.nextLine();
                        if (position >= 1 && position <= guestList.length) {
                            for (int j = guestList.length - 1; j > position - 1; j--) {
                                guestList[j] = guestList[j - 1];
                            }
                       guestList[position -1] = name;
                    } else {
                        System.out.println("Invalid position.");
                        }
                    }
                    break;
                }
         }
         return guestList; 
    }

    public static String[] removeGuest(String[] guestList, Scanner scanner) {
        String[] temp = new String[guestList.length];
                System.out.print("Number: ");
                int number = scanner.nextInt();
                if (number < 1 || number > 10 || guestList[number - 1] == null) {
                    System.out.println("\nError: There is no guest with that number.");
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
        guestList[0] = "Raza Unknown";
        guestList[1] = "Kary Castillo";
        guestList[2] = "Andrea Hernandez";
        guestList[3] = "Angelica Contreras";
        guestList[4] = "Sarah McGinn";
    }

    public static String[] renameGuest(String[] guestList, Scanner scanner) {
        System.out.println("Select a name: ");
        int selection = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a new name: ");
        String newName = scanner.nextLine();

        if (guestList[selection - 1] != null) {
            guestList[selection - 1] = newName;
        }
        return guestList;
    }
}


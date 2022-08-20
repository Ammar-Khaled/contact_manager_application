import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManager c = new ContactManager();
        int selection;
        boolean flag = false;
        String input;
        try (Scanner scanner = new Scanner(System.in)) {

            do {
                System.out.println("Welcome to the Contact Management System \n" +
                        "please, choose an option: \n" +
                        "1. Add a new user \n" +
                        "2. delete a user \n" +
                        "3. show all users ");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        String fname, lname, g;

                        System.out.println("Enter the user first name: ");
                        fname = scanner.next();

                        System.out.println("Enter the user last name: ");
                        lname = scanner.next();

                        System.out.println("Enter the user gender: ");
                        g = scanner.next();

                        System.out.println("Enter the user phone: ");
                        long phone = scanner.nextLong();

                        // System.out.println("Enter the user phone type: ");
                        // String phType = scanner.next();

                        // System.out.println("Enter the user phone description: ");
                        // String phDescription = scanner.next();

                        System.out.println("Enter the user email: ");
                        String e = scanner.next();

                        System.out.println("Enter the user address: ");
                        String ad = scanner.next();

                        c.addUser(fname, lname, g, phone, e, ad);

                        System.out.println("All right, the contact has been added");
                        break;
                    case 2:
                        System.out.println("Enter the user ID: ");
                        int id = scanner.nextInt();
                        c.deleteUser(id);
                        break;
                    case 3:
                        c.showAllUsers();
                        break;
                }
                System.out.println("DO you want to continue? \n" +
                        "press y for yes and n for no");
                input = scanner.next();
                if (input.equals("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            } while (flag == true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

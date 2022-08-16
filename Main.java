import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
    int selection;
    boolean again = false;
    String input;
    Scanner scanner = new Scanner(System.in);
    Contact c = new Contact();
    do{
        System.out.println("Welcome to the Contact Management System \n"+
                                "please, choose an option: \n"+
                                "1. Add a new user \n"+
                                "2. delete a user \n"+
                                "3. show all users ");
        selection = scanner.nextInt();
        switch (selection) {
            case 1:
                User u = new User();
                Phone ph = new Phone();
                Email e = new Email();
                Address ad1 = new Address();
                System.out.println("Enter the user ID: ");
                input = scanner.next();
                u.setID(Long.parseLong(input));
                System.out.println("Enter the user first name: ");
                input = scanner.next();
                u.setFirstname(input);
                System.out.println("Enter the user last name: ");
                input = scanner.next();
                u.setLastname(input);
                System.out.println("Enter the user city: ");
                input = scanner.next();
                u.setCity(input);
                System.out.println("Enter the user gender: ");
                input = scanner.next();
                u.setGender(input);
                System.out.println("Enter the user phone number: ");
                input = scanner.next();
                ph.setPhoneNumber(Long.parseLong(input));
                u.setPhone(ph);
                System.out.println("Enter the user email: ");
                input = scanner.next();
                e.setEmail(input);
                u.setEmail(e);
                System.out.println("Enter the user address: ");
                input = scanner.next();
                ad1.setPlace(input);
                u.setAddress(ad1);

                c.addUser(u);
                System.out.println("All right, the contact has been added");
                break;
            case 2:
                System.out.println("Enter the user Index: ");
                input = scanner.next();
                c.deleteUser(Integer.parseInt(input));
                break;
            case 3:
                c.showAllUsers();
                break;
        }
        System.out.println("DO you want to continue? \n" +
                "press y for yes and n for no");
        input = scanner.next();
        if (input.equals("y")) {
            again = true;
        } else {
            again = false;
        }                       
    }while(again==true);

    }
}

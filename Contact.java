import java.util.ArrayList;

public class Contact {

    ArrayList<User> usersList;
    private static int counter ;

    public Contact() {
        counter = 0;
        usersList = new ArrayList<>();
    }

    public void addUser(long iD, String firstname, String lastname, String gender, String city,Phone ph,
            Email e, Address ad) {
        usersList.add(new User(iD, firstname, lastname, gender, city, ph,
                e, ad));
        counter++;
    }
    
    public void addUser(User u) {
        usersList.add(u);
        counter++;
    }
        
    

    public void addUser(long iD, String firstname, String lastname, String gender, String city,
            long phone, String phType, String phDescription,
            String email, String eType, String eDescription,
            String place, String adType, String adDescription) {
        usersList.add(new User(iD, firstname, lastname, gender, city, phone, phType, phDescription,
                email, eType, eDescription, place, adType, adDescription));
        counter++;
    }

    public void setUserID(int userIndex, long newID) {
        usersList.get(userIndex).setID(newID);
    }

    public void setUserFirstName(int userIndex, String newFirstName) {
        usersList.get(userIndex).setFirstname(newFirstName);
    }

    public int countUsers() {
        return counter;
    }

    public void deleteUser(int userIndex) {
        usersList.remove(userIndex);
        counter--;
    }

    public void showAllUsers() {
        for (int i = 0; i < usersList.size(); i++) {
            usersList.get(i).showUserInfo();
        }
    }

}
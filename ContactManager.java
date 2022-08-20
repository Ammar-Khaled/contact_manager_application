import java.util.ArrayList;

public class ContactManager {

    ArrayList<User> usersList;
    

    public ContactManager() {
        usersList = new ArrayList<>(0);
    }

    public void addUser(String firstname, String lastname, String gender) {
        usersList.add(new User(firstname, lastname, gender));
        
    }
    
    public void addUser( String firstname, String lastname, String gender,
            long phone, String email, String place) {
        usersList.add(new User(firstname, lastname, gender, phone, email, place));
        
    }
    

    public void addUser(String firstname, String lastname, String gender,
            long phone, String phType, String phDescription,
            String email, String eType, String eDescription,
            String place, String adType, String adDescription) {
        usersList.add(new User( firstname, lastname, gender, phone, phType, phDescription,
                email, eType, eDescription, place, adType, adDescription));
        
    }


    public void setUserFirstName(int id, String newFirstName) {
        usersList.get(id).setFirstname(newFirstName);
    }

    public void setUserLastName(int id, String newLastName) {
        usersList.get(id).setFirstname(newLastName);
    }

    public int countUsers() {
        return usersList.size();
    }

    public void deleteUser(int id) {
        usersList.remove(id);
    }

    public void showAllUsers() {
        for (int i = 0; i < usersList.size(); i++) {
            usersList.get(i).showUserInfo();
        }
    }

}
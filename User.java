
public class User {

    private static long counter = 0;
    private long ID = 0;
    private String firstname; 
    private String lastname;
    private String gender;
    private Phone phone;
    private Email email;
    private Address address;
    Object[] connect = new Object[3];

    public User() {
        ID = counter++ ;
    } 

    

    public User(String firstname, String lastname, String gender) {
        ID = counter++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public User( String firstname, String lastname, String gender,
               long phone,String email,String place) {
        ID = counter++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;

        this.phone = new Phone(phone);
        this.email = new Email(email);
        this.address = new Address(place);
        connect[0] = phone;
        connect[1] = email;
        connect[2] = address;

    }



    public User( String firstname, String lastname, String gender,
            long phone, String phType, String phDescription,
            String email, String eType, String eDescription,
            String place, String adType, String adDescription) {
        ID = counter++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        
        this.phone = new Phone(phone, phType, phDescription);
        this.email = new Email(email, eType, eDescription);
        this.address = new Address(place, adType, adDescription);
        connect[0] = phone;
        connect[1] = email;
        connect[2] = address;

    }


    public boolean searchAnyUserData() {
        if (ID == 0 &&
                this.firstname == null &&
                this.lastname == null &&
                this.gender == null &&
                this.phone == null &&
                this.email == null &&
                this.address == null) {
            return false;
        }
        return true;
    }

    public void setPhone(Phone ph) {
        this.phone = ph;
    }

    public void deletePhone() {
        this.phone = null;
    }

    public void setEmail(Email e) {
        this.email = e;
    }

    public void deleteEmail() {
        this.email = null;
    }

    public void setAddress(Address ad) {
        this.address = ad;
    }

    public void deleteAddress() {
        this.address = null;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public long getID() {
        return ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    

    public void showUserInfo() {
        System.out.println("User [ID=" + ID + ", address=" + address.getAddress() +
                ", email=" + email.getEmailInfo() + ", firstname=" + firstname +
                ", lastname=" + lastname + ", gender=" + gender
                + ", phone=" + phone.getPhoneInfo() + "]");;
    }

}

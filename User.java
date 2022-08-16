

public class User {
   
    private long ID;
    private String firstname;
    private String lastname;
    private String gender;
    private String city;
    private Phone phone;
    private Email email;
    private Address address;
    Object[] connect = new Object[3];

    public User() {
    }
     
    
    

    public User(long iD, String firstname, String lastname, String gender, String city,
            long phone, String phType, String phDescription,
            String email, String eType, String eDescription,
            String place, String adType, String adDescription) {
        ID = iD;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.city = city;
        this.phone = new Phone(phone, phType, phDescription);
        this.email = new Email(email, eType, eDescription);
        this.address = new Address(place, adType, adDescription);
        connect[0] = phone;
        connect[1] = email;
        connect[2] = address;
        
    }

    public User(long iD, String firstname, String lastname, String gender, String city, Phone ph, Email e,
            Address ad) {
                ID = iD;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.city = city;
        this.phone = ph;
        this.email = e;
        this.address = ad;
    }




    public boolean searchAnyData() {
        if (this.ID == 0 &&
                this.firstname == null &&
                this.lastname == null &&
                this.gender == null &&
                this.city == null &&
                this.phone == null &&
                this.email == null &&
                this.address == null) {
            return false;
        }
        return true;
    }
    
    public void setPhone(Phone ph ) {
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
    
    public void setAddress(Address ad){
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


    public void setCity(String city) {
        this.city = city;
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


    public String getCity() {
        return city;
    }


    public String showUserInfo() {
        return "User [ID=" + ID + ", address=" + address.get() + ", city=" + city + ", email=" + email.get() + ", firstname="
                + firstname + ", lastname=" + lastname + ", gender=" + gender
                + ", phone=" + phone.getPhoneInfo() + "]";
    }
  

}

public class Phone {
    private long phoneNumber;
    private String type;
    private String description;

    public Phone() {
    }

    
    public Phone(long phone) {
        phoneNumber = phone;
    }


    public Phone(long phoneNumber, String type, String description) {
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.description = description;
    }

    public void setPhoneNumber(long phone) {
        phoneNumber = phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneInfo() {
        return "{phone: " + this.phoneNumber + ", type: " + this.type + ", description: " +
                this.description + "}";
    }
    
}

public class Email {
    private String email;
    private String type;
    private String description;

    public Email() {}
    
    public Email(String email) {
        this.email = email;
    }

    public Email(String email, String type, String description) {
        this.email = email;
        this.type = type;
        this.description = description;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getEmailInfo() {
    return "{email: "+this.email+", type: "+this.type+", description: "+
                this.description + "}";
    }
    
}

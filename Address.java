public class Address {
    private String place;
    private String type;
    private String description;

    public Address() {
    }
    

    public Address(String place) {
        this.place = place;
    }


    public Address(String place, String type, String description) {
        this.place = place;
        this.type = type;
        this.description = description;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String get(){
        return "{place: "+this.place+", type: "+this.type+", description: "+
                this.description + "}";
    }
}

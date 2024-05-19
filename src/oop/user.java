package src.oop;

public class user {
    private String firstName;
    private String lastName;
    private String fullName;

    //SETTER
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }
    
    //SETTER
    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase();
    }

    //GETTER
    public String getFirstName(){
        return firstName;
    }
     
    //GETTER
    public String getLestName(){
        return lastName;
    }

    //GETTER
    public String FullName(){
        return fullName = firstName + " " + lastName;
    }
}

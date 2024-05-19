package src.oop;

public class App {
    
    public static void main(String[] args) {
        user userA = new user();
        userA.setFirstName("Italo");
        userA.setLastName("Alcântara");

        System.out.println(userA.FullName());
    }
}

package src.oop;

public class App {
    
    public static void main(String[] args) {
        
        user[] users = new user[10];
        
        for(int i = 0; i < users.length; i ++){
            user actuali = new user();

            actuali.setFirstName("Nome " + i);
            actuali.setLastName("Sobrenome " + i);
            users[i] = actuali;
        }

        for(int i = 0; i < users.length; i ++){
            System.out.println(users[i].FullName());
        }
    }
}

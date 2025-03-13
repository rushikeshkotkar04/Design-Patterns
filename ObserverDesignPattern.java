import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface Observable {
    void notifyUsers();
}

interface Iphone {

}

class Iphone16 implements Iphone {
    public String name = "Iphone16";

}

class Observer implements Observable {
    List<User> users = new ArrayList<>();
    List<Iphone> products = new ArrayList<>();


    public void addUser(User user) {
        this.users.add(user);
    }

    public void addproduct(Iphone Iphone16) {
        this.products.add(Iphone16);
        notifyUsers();
    }

    public void notifyUsers() {
        for (User user : users) {
            user.notification();
        }
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void notification() {
        System.out.println("The product is avail");
    }
}

public class ObserverDesignPattern {

    public static void main(String[] args) {
        User user1 = new User("Rush");
        Iphone16 iphone16 = new Iphone16();
        Observer observer = new Observer();
        observer.addUser(user1);
        observer.addproduct(iphone16);
    }
}

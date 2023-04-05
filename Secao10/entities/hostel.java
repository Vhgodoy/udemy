package entities;

public class hostel {
    String name;
    String email;
    int room;
    public hostel (int room, String name, String email) {
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String toString() {
        return room +
                ": " +
                name +
                ", " +
                email ;
    }

}

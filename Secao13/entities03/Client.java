package entities03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");

    public String name;
    public String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Client() {
    }
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name + " " + sdf.format(birthDate) + " - " + email;
    }
}

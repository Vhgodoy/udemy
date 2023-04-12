package entities;

public class Employee {

    private Integer id;
    private String name;
    private double salary;

    public Employee() {

    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increase(double percent) {
        this.salary = (percent * salary) / 100 + salary;

    }

    public String toString () {
        return id +
                ", "+
                name+
                ", "+
                String.format("%.2f" , getSalary());
    }


}

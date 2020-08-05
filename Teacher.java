package school.managment.system;

public class Teacher {
    private int id;
    private String name;
    private int Salary;

    public Teacher() {
        this.id =id;
        this.name= name;
        this.Salary = Salary;

    }

    public int getSalary() {
        Salary+=Salary;
        System.out.println("The Salary of the Teacher is "+ Salary);

        return Salary;
    }

    public void setSalary(int salary) {
       this.Salary = Salary;

    }

    public String getName() {
        System.out.println("The name of the Teacher is :"+ name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        System.out.println("the ID number is:"+ id);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

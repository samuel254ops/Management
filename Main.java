package school.managment.system;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Samuel Kuteesa");
        s1.getName();
        s1.setId(001);
        s1.getId();
        s1.setFeespaid(100000);
        s1.getFeespaid();
        System.out.println(s1);

        Teacher t1 = new Teacher();
        t1.setName("Muswangari");
        t1.getName();
        t1.setId(2020);
        t1.getId();
        t1.setSalary(500000);
        t1.getSalary();
        System.out.println(t1);







    }
}

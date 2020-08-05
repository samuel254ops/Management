package school.managment.system;

import java.io.Console;

public class Student {

    private String name;
    private int id;
    private int feespaid;
    private int feesTotal;

    public Student() {
        this.name = name;
        this.id = id;
        feespaid = feespaid;


    }


    public String getName() {
        System.out.println("Enter the name of the student: "+name);

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        System.out.println("Enter the no of ID:"+id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFeespaid() {

        if(feespaid<500000){
            int feesremaining = 500000-feespaid;
            System.out.println("You have fees balance: "+feesremaining);

        }else{
            feespaid= 5000000;
            System.out.println("You have fully paid the school fees");
        }

        return feespaid;
    }

    public void setFeespaid(int feespaid) {
        this.feespaid = feespaid;
    }

    public int getFeesTotal() {

        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}
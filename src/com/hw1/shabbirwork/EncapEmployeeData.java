package com.hw1.shabbirwork;

public class EncapEmployeeData {


    //
    private String employeeName;
    private int age;
    private int ssn;

    public static void main(String[] args) {
        EncapEmployeeData emp = new EncapEmployeeData ();
        emp.setEmployeeName("Shabbir Khan");
        emp.setAge(36);
        emp.setSsn(222333);

        System.out.println(" Employee name is "+emp.getEmployeeName());
        System.out.println("Employee age is "+emp.getAge());
        System.out.println("Employee ssn is "+emp.getSsn());



    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}

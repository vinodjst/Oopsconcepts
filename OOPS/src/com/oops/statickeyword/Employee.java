package com.oops.statickeyword;

public class Employee {

    private int empId;

    private String empName;

    private String email;

    private static String empOrg = "HCL";



    void displayEmployeeDetails(){

        System.out.println( "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", empOrg='" + empOrg + '\'' +
                '}');

    }

    static void validateEmail(String empEmail){

        System.out.println("It is a valid email");
    }
    static void run(){
        System.out.println("running");
    }


    //setters and getters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpOrg() {
        return empOrg;
    }

    public void setEmpOrg(String empOrg) {
        this.empOrg = empOrg;
    }


}

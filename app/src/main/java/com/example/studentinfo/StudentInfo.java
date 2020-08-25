package com.example.studentinfo;

public class StudentInfo {
    String fullname , reg_no, department ,year;

    public  StudentInfo(){

    }
    public StudentInfo(String fullname, String reg_no, String department, String year) {
        this.fullname = fullname;
        this.reg_no = reg_no;
        this.department = department;
        this.year = year;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

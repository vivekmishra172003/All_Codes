package com.spring.app;

import java.util.List;

public class Department {
    
    private int departmentId;
    private List<Staff> staffs;
    
    
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public List<Staff> getStaffs() {
        return staffs;
    }
    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
    
    /* Write a two argument constructor which accepts departmentId and list of 
                                                  staffs as the parameters */
    public Department(int departmentId, List<Staff> staffs) {
        super();
        this.departmentId = departmentId;
        this.staffs = staffs;
    }
    
    public void displayStaffDetails() {
        System.out.println("Staff Details:");
        for(Staff staff : staffs) {
            System.out.println("\nStaff Id:" + staff.getStaffId());
            System.out.println("\nStaff Name:" + staff.getStaffName());
            System.out.println("\nContact Number:" + staff.getContactNo());
            System.out.println("\nDepartment Name:" + staff.getDepartmentName());
            System.out.println("\nDepartment Id:" + this.departmentId);
        }
    }
}
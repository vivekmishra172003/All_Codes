package com.spring.app;

public class Staff {
    
    private int staffId;
    private String staffName;
    private String departmentName;
    private long contactNo;
    
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public long getContactNo() {
        return contactNo;
    }
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    /* Write a four argument constructor which accepts staffId, staffName, departmentName 
                                                      and contactNo as the parameters. */
    public Staff(int staffId, String staffName, String departmentName, long contactNo) {
        super();
        this.staffId = staffId;
        this.staffName = staffName;
        this.departmentName = departmentName;
        this.contactNo = contactNo;
    }
}
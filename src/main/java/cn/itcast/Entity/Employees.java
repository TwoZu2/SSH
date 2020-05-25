package cn.itcast.Entity;

public class Employees {
    private int empId;
    private String empName;
    private String empSex;
    private int empAge;
    private String empAddress;
    private String empPhone;
    private String empTime;
    private String empIdentity;

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

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpTime() {
        return empTime;
    }

    public void setEmpTime(String empTime) {
        this.empTime = empTime;
    }

    public String getEmpIdentity() {
        return empIdentity;
    }

    public void setEmpIdentity(String empIdentity) {
        this.empIdentity = empIdentity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (empId != employees.empId) return false;
        if (empAge != employees.empAge) return false;
        if (empName != null ? !empName.equals(employees.empName) : employees.empName != null) return false;
        if (empSex != null ? !empSex.equals(employees.empSex) : employees.empSex != null) return false;
        if (empAddress != null ? !empAddress.equals(employees.empAddress) : employees.empAddress != null) return false;
        if (empPhone != null ? !empPhone.equals(employees.empPhone) : employees.empPhone != null) return false;
        if (empTime != null ? !empTime.equals(employees.empTime) : employees.empTime != null) return false;
        if (empIdentity != null ? !empIdentity.equals(employees.empIdentity) : employees.empIdentity != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empSex != null ? empSex.hashCode() : 0);
        result = 31 * result + empAge;
        result = 31 * result + (empAddress != null ? empAddress.hashCode() : 0);
        result = 31 * result + (empPhone != null ? empPhone.hashCode() : 0);
        result = 31 * result + (empTime != null ? empTime.hashCode() : 0);
        result = 31 * result + (empIdentity != null ? empIdentity.hashCode() : 0);
        return result;
    }
}

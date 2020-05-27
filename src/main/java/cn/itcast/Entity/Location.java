package cn.itcast.Entity;

import org.springframework.stereotype.Component;


import java.util.Set;
@Component
public class Location {
    private int locId;
    private String locName;
    private String locText;
    private Set<Employees> employees;
    private Department departmentByDeparId;
    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocText() {
        return locText;
    }

    public void setLocText(String locText) {
        this.locText = locText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (locId != location.locId) return false;
        if (locName != null ? !locName.equals(location.locName) : location.locName != null) return false;
        if (locText != null ? !locText.equals(location.locText) : location.locText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locId;
        result = 31 * result + (locName != null ? locName.hashCode() : 0);
        result = 31 * result + (locText != null ? locText.hashCode() : 0);
        return result;
    }



    public Department getDepartmentByDeparId() {
        return departmentByDeparId;
    }

    public void setDepartmentByDeparId(Department departmentByDeparId) {
        this.departmentByDeparId = departmentByDeparId;
    }

    @Override


    public String toString() {
        return "Location{" +
                "locId=" + locId +
                ", locName='" + locName + '\'' +
                ", locText='" + locText + '\'' +
                ", employees=" + employees +
                ", departmentByDeparId=" + departmentByDeparId +
                '}';
    }
}

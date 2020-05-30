package cn.itcast.Entity;

import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Set;
@Component
public class Location {
    private int locId;
    private String locName;
    private String locText;
    private String  deparId;
  //  private Set<Employees> employees;
    //private Department departmentByDeparId;

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

    public String getDeparId() {
        return deparId;
    }

    public void setDeparId(String deparId) {
        this.deparId = deparId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locId == location.locId &&
                Objects.equals(locName, location.locName) &&
                Objects.equals(locText, location.locText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locId, locName, locText);
    }

    @Override
    public String toString() {
        return "Location{" +
                "locId=" + locId +
                ", locName='" + locName + '\'' +
                ", locText='" + locText + '\'' +
                ", deparId=" + deparId +
                '}';
    }
}

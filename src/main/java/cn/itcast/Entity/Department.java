package cn.itcast.Entity;

import java.util.Set;

public class Department {
    private int depId;
    private String depName;
    private int depNum;
    private String depIntroduce;
    private Set<Location> locations;
    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public String getDepIntroduce() {
        return depIntroduce;
    }

    public void setDepIntroduce(String depIntroduce) {
        this.depIntroduce = depIntroduce;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (depId != that.depId) return false;
        if (depNum != that.depNum) return false;
        if (depName != null ? !depName.equals(that.depName) : that.depName != null) return false;
        if (depIntroduce != null ? !depIntroduce.equals(that.depIntroduce) : that.depIntroduce != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depId;
        result = 31 * result + (depName != null ? depName.hashCode() : 0);
        result = 31 * result + depNum;
        result = 31 * result + (depIntroduce != null ? depIntroduce.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depNum=" + depNum +
                ", depIntroduce='" + depIntroduce + '\'' +
                '}';
    }
}

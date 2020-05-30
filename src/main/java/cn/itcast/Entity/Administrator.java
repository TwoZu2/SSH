package cn.itcast.Entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Administrator {
    private int adminId;
    private String adminName;
    private String adminPassword;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrator that = (Administrator) o;

        if (adminId != that.adminId) return false;
        if (adminName != null ? !adminName.equals(that.adminName) : that.adminName != null) return false;
        if (adminPassword != null ? !adminPassword.equals(that.adminPassword) : that.adminPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId;
        result = 31 * result + (adminName != null ? adminName.hashCode() : 0);
        result = 31 * result + (adminPassword != null ? adminPassword.hashCode() : 0);
        return result;
    }
}

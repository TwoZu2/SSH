package cn.itcast.Entity;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Component
public class Apply {
    private int apyId;
    private String apyPostion;

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    private int locId;
    private String apyName;
    private String apySex;
    private int empAge;
    private Timestamp apyTime;
    private String apyEducation;
    private String apyPhone;
    private String apyIdentity;
    private String empAddress;

    public int getApyId() {
        return apyId;
    }

    public void setApyId(int apyId) {
        this.apyId = apyId;
    }

    public String getApyPostion() {
        return apyPostion;
    }

    public void setApyPostion(String apyPostion) {
        this.apyPostion = apyPostion;
    }

    public String getApyName() {
        return apyName;
    }

    public void setApyName(String apyName) {
        this.apyName = apyName;
    }

    public String getApySex() {
        return apySex;
    }

    public void setApySex(String apySex) {
        this.apySex = apySex;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public Timestamp getApyTime() {
        return apyTime;
    }

    public void setApyTime(Timestamp apyTime) {
        this.apyTime = apyTime;
    }

    public String getApyEducation() {
        return apyEducation;
    }

    public void setApyEducation(String apyEducation) {
        this.apyEducation = apyEducation;
    }

    public String getApyPhone() {
        return apyPhone;
    }

    public void setApyPhone(String apyPhone) {
        this.apyPhone = apyPhone;
    }

    public String getApyIdentity() {
        return apyIdentity;
    }

    public void setApyIdentity(String apyIdentity) {
        this.apyIdentity = apyIdentity;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apply apply = (Apply) o;

        if (apyId != apply.apyId) return false;
        if (empAge != apply.empAge) return false;
        if (apyPostion != null ? !apyPostion.equals(apply.apyPostion) : apply.apyPostion != null) return false;
        if (apyName != null ? !apyName.equals(apply.apyName) : apply.apyName != null) return false;
        if (apySex != null ? !apySex.equals(apply.apySex) : apply.apySex != null) return false;
        if (apyTime != null ? !apyTime.equals(apply.apyTime) : apply.apyTime != null) return false;
        if (apyEducation != null ? !apyEducation.equals(apply.apyEducation) : apply.apyEducation != null) return false;
        if (apyPhone != null ? !apyPhone.equals(apply.apyPhone) : apply.apyPhone != null) return false;
        if (apyIdentity != null ? !apyIdentity.equals(apply.apyIdentity) : apply.apyIdentity != null) return false;
        if (empAddress != null ? !empAddress.equals(apply.empAddress) : apply.empAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apyId;
        result = 31 * result + (apyPostion != null ? apyPostion.hashCode() : 0);
        result = 31 * result + (apyName != null ? apyName.hashCode() : 0);
        result = 31 * result + (apySex != null ? apySex.hashCode() : 0);
        result = 31 * result + empAge;
        result = 31 * result + (apyTime != null ? apyTime.hashCode() : 0);
        result = 31 * result + (apyEducation != null ? apyEducation.hashCode() : 0);
        result = 31 * result + (apyPhone != null ? apyPhone.hashCode() : 0);
        result = 31 * result + (apyIdentity != null ? apyIdentity.hashCode() : 0);
        result = 31 * result + (empAddress != null ? empAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "apyId=" + apyId +
                ", apyPostion='" + apyPostion + '\'' +
                ", locId=" + locId +
                ", apyName='" + apyName + '\'' +
                ", apySex='" + apySex + '\'' +
                ", empAge=" + empAge +
                ", apyTime=" + apyTime +
                ", apyEducation='" + apyEducation + '\'' +
                ", apyPhone='" + apyPhone + '\'' +
                ", apyIdentity='" + apyIdentity + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}

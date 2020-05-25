package cn.itcast.Entity;

import java.sql.Timestamp;

public class Recruitment {
    private int retId;
    private String retDepartment;
    private String retPostion;
    private String retText;
    private String retDemand;
    private int retNum;
    private String workPlace;
    private Timestamp beginTime;
    private Timestamp endTime;

    public int getRetId() {
        return retId;
    }

    public void setRetId(int retId) {
        this.retId = retId;
    }

    public String getRetDepartment() {
        return retDepartment;
    }

    public void setRetDepartment(String retDepartment) {
        this.retDepartment = retDepartment;
    }

    public String getRetPostion() {
        return retPostion;
    }

    public void setRetPostion(String retPostion) {
        this.retPostion = retPostion;
    }

    public String getRetText() {
        return retText;
    }

    public void setRetText(String retText) {
        this.retText = retText;
    }

    public String getRetDemand() {
        return retDemand;
    }

    public void setRetDemand(String retDemand) {
        this.retDemand = retDemand;
    }

    public int getRetNum() {
        return retNum;
    }

    public void setRetNum(int retNum) {
        this.retNum = retNum;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recruitment that = (Recruitment) o;

        if (retId != that.retId) return false;
        if (retNum != that.retNum) return false;
        if (retDepartment != null ? !retDepartment.equals(that.retDepartment) : that.retDepartment != null)
            return false;
        if (retPostion != null ? !retPostion.equals(that.retPostion) : that.retPostion != null) return false;
        if (retText != null ? !retText.equals(that.retText) : that.retText != null) return false;
        if (retDemand != null ? !retDemand.equals(that.retDemand) : that.retDemand != null) return false;
        if (workPlace != null ? !workPlace.equals(that.workPlace) : that.workPlace != null) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = retId;
        result = 31 * result + (retDepartment != null ? retDepartment.hashCode() : 0);
        result = 31 * result + (retPostion != null ? retPostion.hashCode() : 0);
        result = 31 * result + (retText != null ? retText.hashCode() : 0);
        result = 31 * result + (retDemand != null ? retDemand.hashCode() : 0);
        result = 31 * result + retNum;
        result = 31 * result + (workPlace != null ? workPlace.hashCode() : 0);
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }
}

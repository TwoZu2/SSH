package cn.itcast.Entity;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class Selling {
    private int selId;
    private String userName;
    private String sellDescribe;
    private Timestamp selTime;
    private String selName;
    private int selNumber;

    public int getSelId() {
        return selId;
    }

    public void setSelId(int selId) {
        this.selId = selId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSellDescribe() {
        return sellDescribe;
    }

    public void setSellDescribe(String sellDescribe) {
        this.sellDescribe = sellDescribe;
    }

    public Timestamp getSelTime() {
        return selTime;
    }

    public void setSelTime(Timestamp selTime) {
        this.selTime = selTime;
    }

    public String getSelName() {
        return selName;
    }

    public void setSelName(String selName) {
        this.selName = selName;
    }

    public int getSelNumber() {
        return selNumber;
    }

    public void setSelNumber(int selNumber) {
        this.selNumber = selNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Selling selling = (Selling) o;

        if (selId != selling.selId) return false;
        if (selNumber != selling.selNumber) return false;
        if (userName != null ? !userName.equals(selling.userName) : selling.userName != null) return false;
        if (sellDescribe != null ? !sellDescribe.equals(selling.sellDescribe) : selling.sellDescribe != null)
            return false;
        if (selTime != null ? !selTime.equals(selling.selTime) : selling.selTime != null) return false;
        if (selName != null ? !selName.equals(selling.selName) : selling.selName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = selId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (sellDescribe != null ? sellDescribe.hashCode() : 0);
        result = 31 * result + (selTime != null ? selTime.hashCode() : 0);
        result = 31 * result + (selName != null ? selName.hashCode() : 0);
        result = 31 * result + selNumber;
        return result;
    }


    @Override
    public String toString() {
        return "Selling{" +
                "selId=" + selId +
                ", userName='" + userName + '\'' +
                ", sellDescribe='" + sellDescribe + '\'' +
                ", selTime=" + selTime +
                ", selName='" + selName + '\'' +
                ", selNumber=" + selNumber +
                '}';
    }

}

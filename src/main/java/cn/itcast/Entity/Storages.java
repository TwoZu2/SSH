package cn.itcast.Entity;

import java.sql.Timestamp;

public class Storages {
    private int stoId;
    private String userName;
    private Timestamp stoTime;
    private String stoName;
    private int stoNumber;

    public int getStoId() {
        return stoId;
    }

    public void setStoId(int stoId) {
        this.stoId = stoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getStoTime() {
        return stoTime;
    }

    public void setStoTime(Timestamp stoTime) {
        this.stoTime = stoTime;
    }

    public String getStoName() {
        return stoName;
    }

    public void setStoName(String stoName) {
        this.stoName = stoName;
    }

    public int getStoNumber() {
        return stoNumber;
    }

    public void setStoNumber(int stoNumber) {
        this.stoNumber = stoNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storages storages = (Storages) o;

        if (stoId != storages.stoId) return false;
        if (stoNumber != storages.stoNumber) return false;
        if (userName != null ? !userName.equals(storages.userName) : storages.userName != null) return false;
        if (stoTime != null ? !stoTime.equals(storages.stoTime) : storages.stoTime != null) return false;
        if (stoName != null ? !stoName.equals(storages.stoName) : storages.stoName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stoId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (stoTime != null ? stoTime.hashCode() : 0);
        result = 31 * result + (stoName != null ? stoName.hashCode() : 0);
        result = 31 * result + stoNumber;
        return result;
    }
}

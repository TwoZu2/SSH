package cn.itcast.Entity;

import java.sql.Timestamp;

public class Industrynews {
    private int newId;
    private Timestamp newTime;
    private String newTitle;
    private String newMessage;

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public Timestamp getNewTime() {
        return newTime;
    }

    public void setNewTime(Timestamp newTime) {
        this.newTime = newTime;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Industrynews that = (Industrynews) o;

        if (newId != that.newId) return false;
        if (newTime != null ? !newTime.equals(that.newTime) : that.newTime != null) return false;
        if (newTitle != null ? !newTitle.equals(that.newTitle) : that.newTitle != null) return false;
        if (newMessage != null ? !newMessage.equals(that.newMessage) : that.newMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newId;
        result = 31 * result + (newTime != null ? newTime.hashCode() : 0);
        result = 31 * result + (newTitle != null ? newTitle.hashCode() : 0);
        result = 31 * result + (newMessage != null ? newMessage.hashCode() : 0);
        return result;
    }
}

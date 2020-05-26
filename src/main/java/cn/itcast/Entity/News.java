package cn.itcast.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Component
public class News {
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

        News news = (News) o;

        if (newId != news.newId) return false;
        if (newTime != null ? !newTime.equals(news.newTime) : news.newTime != null) return false;
        if (newTitle != null ? !newTitle.equals(news.newTitle) : news.newTitle != null) return false;
        if (newMessage != null ? !newMessage.equals(news.newMessage) : news.newMessage != null) return false;

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

    @Override
    public String toString() {
        return "News{" +
                "newId=" + newId +
                ", newTime=" + newTime +
                ", newTitle='" + newTitle + '\'' +
                ", newMessage='" + newMessage + '\'' +
                '}';
    }
}

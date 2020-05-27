package cn.itcast.Entity;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private int megId;
    private String megName;
    private String megContent;
    private String replyContent;

    public int getMegId() {
        return megId;
    }

    public void setMegId(int megId) {
        this.megId = megId;
    }

    public String getMegName() {
        return megName;
    }

    public void setMegName(String megName) {
        this.megName = megName;
    }

    public String getMegContent() {
        return megContent;
    }

    public void setMegContent(String megContent) {
        this.megContent = megContent;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (megId != message.megId) return false;
        if (megName != null ? !megName.equals(message.megName) : message.megName != null) return false;
        if (megContent != null ? !megContent.equals(message.megContent) : message.megContent != null) return false;
        if (replyContent != null ? !replyContent.equals(message.replyContent) : message.replyContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = megId;
        result = 31 * result + (megName != null ? megName.hashCode() : 0);
        result = 31 * result + (megContent != null ? megContent.hashCode() : 0);
        result = 31 * result + (replyContent != null ? replyContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "megId=" + megId +
                ", megName='" + megName + '\'' +
                ", megContent='" + megContent + '\'' +
                ", replyContent='" + replyContent + '\'' +
                '}';
    }
}

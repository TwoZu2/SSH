package cn.itcast.Entity;

import java.sql.Timestamp;

public class Contactus {
    private int contId;
    private Integer contImage;
    private String contName;
    private String contMessage;
    private Timestamp contTime;
    private String replyContent;
    private String retshow;

    public int getContId() {
        return contId;
    }

    public void setContId(int contId) {
        this.contId = contId;
    }

    public Integer getContImage() {
        return contImage;
    }

    public void setContImage(Integer contImage) {
        this.contImage = contImage;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContMessage() {
        return contMessage;
    }

    public void setContMessage(String contMessage) {
        this.contMessage = contMessage;
    }

    public Timestamp getContTime() {
        return contTime;
    }

    public void setContTime(Timestamp contTime) {
        this.contTime = contTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getRetshow() {
        return retshow;
    }

    public void setRetshow(String retshow) {
        this.retshow = retshow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contactus contactus = (Contactus) o;

        if (contId != contactus.contId) return false;
        if (contImage != null ? !contImage.equals(contactus.contImage) : contactus.contImage != null) return false;
        if (contName != null ? !contName.equals(contactus.contName) : contactus.contName != null) return false;
        if (contMessage != null ? !contMessage.equals(contactus.contMessage) : contactus.contMessage != null)
            return false;
        if (contTime != null ? !contTime.equals(contactus.contTime) : contactus.contTime != null) return false;
        if (replyContent != null ? !replyContent.equals(contactus.replyContent) : contactus.replyContent != null)
            return false;
        if (retshow != null ? !retshow.equals(contactus.retshow) : contactus.retshow != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contId;
        result = 31 * result + (contImage != null ? contImage.hashCode() : 0);
        result = 31 * result + (contName != null ? contName.hashCode() : 0);
        result = 31 * result + (contMessage != null ? contMessage.hashCode() : 0);
        result = 31 * result + (contTime != null ? contTime.hashCode() : 0);
        result = 31 * result + (replyContent != null ? replyContent.hashCode() : 0);
        result = 31 * result + (retshow != null ? retshow.hashCode() : 0);
        return result;
    }
}

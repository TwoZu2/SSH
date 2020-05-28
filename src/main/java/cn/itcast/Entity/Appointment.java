package cn.itcast.Entity;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Component
public class Appointment {
    private int aptId;
    private String aptName;
    private String aptPhone;
    private String aptNo;
    private String aptType;
    private Timestamp appointmentTime;
    private String serviceType;

    public int getAptId() {
        return aptId;
    }

    public void setAptId(int aptId) {
        this.aptId = aptId;
    }

    public String getAptName() {
        return aptName;
    }

    public void setAptName(String aptName) {
        this.aptName = aptName;
    }

    public String getAptPhone() {
        return aptPhone;
    }

    public void setAptPhone(String aptPhone) {
        this.aptPhone = aptPhone;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getAptType() {
        return aptType;
    }

    public void setAptType(String aptType) {
        this.aptType = aptType;
    }

    public Timestamp getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Timestamp appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appointment that = (Appointment) o;

        if (aptId != that.aptId) return false;
        if (aptName != null ? !aptName.equals(that.aptName) : that.aptName != null) return false;
        if (aptPhone != null ? !aptPhone.equals(that.aptPhone) : that.aptPhone != null) return false;
        if (aptNo != null ? !aptNo.equals(that.aptNo) : that.aptNo != null) return false;
        if (aptType != null ? !aptType.equals(that.aptType) : that.aptType != null) return false;
        if (appointmentTime != null ? !appointmentTime.equals(that.appointmentTime) : that.appointmentTime != null)
            return false;
        if (serviceType != null ? !serviceType.equals(that.serviceType) : that.serviceType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aptId;
        result = 31 * result + (aptName != null ? aptName.hashCode() : 0);
        result = 31 * result + (aptPhone != null ? aptPhone.hashCode() : 0);
        result = 31 * result + (aptNo != null ? aptNo.hashCode() : 0);
        result = 31 * result + (aptType != null ? aptType.hashCode() : 0);
        result = 31 * result + (appointmentTime != null ? appointmentTime.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "aptId=" + aptId +
                ", aptName='" + aptName + '\'' +
                ", aptPhone='" + aptPhone + '\'' +
                ", aptNo='" + aptNo + '\'' +
                ", aptType='" + aptType + '\'' +
                ", appointmentTime=" + appointmentTime +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}

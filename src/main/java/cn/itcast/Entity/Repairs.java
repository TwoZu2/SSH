package cn.itcast.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Repairs {
    private int repId;
    private String repName;
    private String repPhone;
    private String repType;
    private String repNum;
    private Timestamp repTime;
    private String time;
    private String repService;
    private String repPerson;
    private BigDecimal repPrice;
    private String repState;
    private Timestamp carTime;

    public int getRepId() {
        return repId;
    }

    public void setRepId(int repId) {
        this.repId = repId;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getRepPhone() {
        return repPhone;
    }

    public void setRepPhone(String repPhone) {
        this.repPhone = repPhone;
    }

    public String getRepType() {
        return repType;
    }

    public void setRepType(String repType) {
        this.repType = repType;
    }

    public String getRepNum() {
        return repNum;
    }

    public void setRepNum(String repNum) {
        this.repNum = repNum;
    }

    public Timestamp getRepTime() {
        return repTime;
    }

    public void setRepTime(Timestamp repTime) {
        this.repTime = repTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRepService() {
        return repService;
    }

    public void setRepService(String repService) {
        this.repService = repService;
    }

    public String getRepPerson() {
        return repPerson;
    }

    public void setRepPerson(String repPerson) {
        this.repPerson = repPerson;
    }

    public BigDecimal getRepPrice() {
        return repPrice;
    }

    public void setRepPrice(BigDecimal repPrice) {
        this.repPrice = repPrice;
    }

    public String getRepState() {
        return repState;
    }

    public void setRepState(String repState) {
        this.repState = repState;
    }

    public Timestamp getCarTime() {
        return carTime;
    }

    public void setCarTime(Timestamp carTime) {
        this.carTime = carTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repairs repairs = (Repairs) o;

        if (repId != repairs.repId) return false;
        if (repName != null ? !repName.equals(repairs.repName) : repairs.repName != null) return false;
        if (repPhone != null ? !repPhone.equals(repairs.repPhone) : repairs.repPhone != null) return false;
        if (repType != null ? !repType.equals(repairs.repType) : repairs.repType != null) return false;
        if (repNum != null ? !repNum.equals(repairs.repNum) : repairs.repNum != null) return false;
        if (repTime != null ? !repTime.equals(repairs.repTime) : repairs.repTime != null) return false;
        if (time != null ? !time.equals(repairs.time) : repairs.time != null) return false;
        if (repService != null ? !repService.equals(repairs.repService) : repairs.repService != null) return false;
        if (repPerson != null ? !repPerson.equals(repairs.repPerson) : repairs.repPerson != null) return false;
        if (repPrice != null ? !repPrice.equals(repairs.repPrice) : repairs.repPrice != null) return false;
        if (repState != null ? !repState.equals(repairs.repState) : repairs.repState != null) return false;
        if (carTime != null ? !carTime.equals(repairs.carTime) : repairs.carTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repId;
        result = 31 * result + (repName != null ? repName.hashCode() : 0);
        result = 31 * result + (repPhone != null ? repPhone.hashCode() : 0);
        result = 31 * result + (repType != null ? repType.hashCode() : 0);
        result = 31 * result + (repNum != null ? repNum.hashCode() : 0);
        result = 31 * result + (repTime != null ? repTime.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (repService != null ? repService.hashCode() : 0);
        result = 31 * result + (repPerson != null ? repPerson.hashCode() : 0);
        result = 31 * result + (repPrice != null ? repPrice.hashCode() : 0);
        result = 31 * result + (repState != null ? repState.hashCode() : 0);
        result = 31 * result + (carTime != null ? carTime.hashCode() : 0);
        return result;
    }
}

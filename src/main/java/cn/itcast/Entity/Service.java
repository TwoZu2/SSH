package cn.itcast.Entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Service {
    private int serId;
    private String serName;
    private BigDecimal serPrice;
    private String serIntroduce;
    private String serviceType;

    public int getSerId() {
        return serId;
    }

    public void setSerId(int serId) {
        this.serId = serId;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public BigDecimal getSerPrice() {
        return serPrice;
    }

    public void setSerPrice(BigDecimal serPrice) {
        this.serPrice = serPrice;
    }

    public String getSerIntroduce() {
        return serIntroduce;
    }

    public void setSerIntroduce(String serIntroduce) {
        this.serIntroduce = serIntroduce;
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

        Service service = (Service) o;

        if (serId != service.serId) return false;
        if (serName != null ? !serName.equals(service.serName) : service.serName != null) return false;
        if (serPrice != null ? !serPrice.equals(service.serPrice) : service.serPrice != null) return false;
        if (serIntroduce != null ? !serIntroduce.equals(service.serIntroduce) : service.serIntroduce != null)
            return false;
        if (serviceType != null ? !serviceType.equals(service.serviceType) : service.serviceType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serId;
        result = 31 * result + (serName != null ? serName.hashCode() : 0);
        result = 31 * result + (serPrice != null ? serPrice.hashCode() : 0);
        result = 31 * result + (serIntroduce != null ? serIntroduce.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        return result;
    }
}

package cn.itcast.Entity;

import java.math.BigDecimal;

public class Inventory {
    private int ityId;
    private String ityName;
    private int ityNumber;
    private String ityBrand;
    private BigDecimal purchasePrice;
    private String ityModels;
    private String ityType;
    private BigDecimal outPrice;
    private String ityRole;

    public int getItyId() {
        return ityId;
    }

    public void setItyId(int ityId) {
        this.ityId = ityId;
    }

    public String getItyName() {
        return ityName;
    }

    public void setItyName(String ityName) {
        this.ityName = ityName;
    }

    public int getItyNumber() {
        return ityNumber;
    }

    public void setItyNumber(int ityNumber) {
        this.ityNumber = ityNumber;
    }

    public String getItyBrand() {
        return ityBrand;
    }

    public void setItyBrand(String ityBrand) {
        this.ityBrand = ityBrand;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getItyModels() {
        return ityModels;
    }

    public void setItyModels(String ityModels) {
        this.ityModels = ityModels;
    }

    public String getItyType() {
        return ityType;
    }

    public void setItyType(String ityType) {
        this.ityType = ityType;
    }

    public BigDecimal getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(BigDecimal outPrice) {
        this.outPrice = outPrice;
    }

    public String getItyRole() {
        return ityRole;
    }

    public void setItyRole(String ityRole) {
        this.ityRole = ityRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inventory inventory = (Inventory) o;

        if (ityId != inventory.ityId) return false;
        if (ityNumber != inventory.ityNumber) return false;
        if (ityName != null ? !ityName.equals(inventory.ityName) : inventory.ityName != null) return false;
        if (ityBrand != null ? !ityBrand.equals(inventory.ityBrand) : inventory.ityBrand != null) return false;
        if (purchasePrice != null ? !purchasePrice.equals(inventory.purchasePrice) : inventory.purchasePrice != null)
            return false;
        if (ityModels != null ? !ityModels.equals(inventory.ityModels) : inventory.ityModels != null) return false;
        if (ityType != null ? !ityType.equals(inventory.ityType) : inventory.ityType != null) return false;
        if (outPrice != null ? !outPrice.equals(inventory.outPrice) : inventory.outPrice != null) return false;
        if (ityRole != null ? !ityRole.equals(inventory.ityRole) : inventory.ityRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ityId;
        result = 31 * result + (ityName != null ? ityName.hashCode() : 0);
        result = 31 * result + ityNumber;
        result = 31 * result + (ityBrand != null ? ityBrand.hashCode() : 0);
        result = 31 * result + (purchasePrice != null ? purchasePrice.hashCode() : 0);
        result = 31 * result + (ityModels != null ? ityModels.hashCode() : 0);
        result = 31 * result + (ityType != null ? ityType.hashCode() : 0);
        result = 31 * result + (outPrice != null ? outPrice.hashCode() : 0);
        result = 31 * result + (ityRole != null ? ityRole.hashCode() : 0);
        return result;
    }
}

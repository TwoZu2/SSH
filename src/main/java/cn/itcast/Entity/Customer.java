package cn.itcast.Entity;

public class Customer {
    private int custId;
    private String custName;
    private String custPassword;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (custId != customer.custId) return false;
        if (custName != null ? !custName.equals(customer.custName) : customer.custName != null) return false;
        if (custPassword != null ? !custPassword.equals(customer.custPassword) : customer.custPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = custId;
        result = 31 * result + (custName != null ? custName.hashCode() : 0);
        result = 31 * result + (custPassword != null ? custPassword.hashCode() : 0);
        return result;
    }
}

package exercise7_1.src;

public class Visit extends Customer{
    Customer customer;
    java.util.Date Date;
    private Double serviceExpense;
    private Double productExpense;
    public Visit(Customer customer ,  java.util.Date Date) {
        super(customer.getName());
        this.customer = customer;
        this.Date = Date;
    }
    public String getName(){
        return super.getName();
    }
    public Double getServiceExpense(){
        if(customer.isMember()){
            if(customer.getMemberType().equals(MemberType.PREMIUM.toString()))return this.serviceExpense - (DiscountRate.serviceDiscountPremium.value * this.serviceExpense);
            else if(customer.getMemberType().equals(MemberType.GOLD.toString()))return this.serviceExpense - (DiscountRate.serviceDiscountGold.value * this.serviceExpense);
            else if(customer.getMemberType().equals(MemberType.SILVER.toString()))return this.serviceExpense - (DiscountRate.serviceDiscountSilver.value * this.serviceExpense);
        }
        return serviceExpense;
    }
    public void setServiceExpense(Double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public Double getProductExpense() {
        if(customer.isMember()){
            if(customer.getMemberType().equals(MemberType.PREMIUM.toString()))return this.productExpense - (DiscountRate.productDiscountPremium.value * this.productExpense);
            else if(customer.getMemberType().equals(MemberType.GOLD.toString()))return this.productExpense - (DiscountRate.productDiscountGold.value * this.productExpense);
            else if(customer.getMemberType().equals(MemberType.SILVER.toString()))return this.productExpense - (DiscountRate.productDiscountSilver.value * this.productExpense);
        }
        return productExpense;
    }
    public void setProductExpense(Double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return getServiceExpense() + getProductExpense();
    }

    //
    public String toString(){
        return "[ServiceExpense= " + getServiceExpense() + ", ProductExpense= " + getProductExpense() + ", Total = " + getTotalExpense() + "]";
    }
}

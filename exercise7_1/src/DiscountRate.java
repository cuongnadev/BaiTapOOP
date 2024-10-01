package exercise7_1.src;

public enum DiscountRate {
    serviceDiscountPremium(0.2),
    serviceDiscountGold(0.15),
    serviceDiscountSilver(0.1), 
    productDiscountPremium(0.1),
    productDiscountGold(0.1),
    productDiscountSilver(0.1);

    Double value;
    DiscountRate (Double value){
        this.value = value;
    }
    
    public Double getValue(){
        return this.value;
    }
    public void setValue (Double value){
        this.value = value;
    }

}

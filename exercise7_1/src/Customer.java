package exercise7_1.src;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    public Customer(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean isMember(){
        return this.member;
    }
    public void setMember (boolean member){
        this.member = member;
    }
    public String getMemberType(){
        return this.memberType;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    public String toString(){
        return "Customer[Name = " + this.name  + ", member = " + this.member + ", memberType = " + this.memberType + "]";
    }
}

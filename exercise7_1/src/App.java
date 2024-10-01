package exercise7_1.src;


import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("JavaBoy");
        customer.setMemberType(MemberType.PREMIUM.toString());
        customer.setMember(true);
        System.out.println(customer.toString());
        Visit visit = new Visit(customer, new Date());

        visit.setServiceExpense(20000.0);
        visit.setProductExpense(30000.0);

        System.out.println(visit.toString());
    }
}

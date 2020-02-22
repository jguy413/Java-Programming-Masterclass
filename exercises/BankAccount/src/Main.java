public class Main {

    public static void main(String[] args) {

        //BankAccount account123 = new BankAccount(); //123, 1258.23, "Timmy Fealear","FearTheEar_87@hotmail.com", "123-345-1827");
        //account123.setAccountNum(123);
        //account123.setBalance(1258.23);
        //account123.setClientName("Timmy Feelear");
        //account123.setClientEmail("FearTheEar_87@hotmail.com");
//        System.out.println("Client Name: " + account123.getClientName());
//        account123.deposit(500.34);
//        account123.withdraw(1400);
//        System.out.println(account123.getBalance());
//        account123.withdraw(2000);

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName() + " " + vip1.getCreditLimit() + " " + vip1.getEmail());

        VipCustomer vip2 = new VipCustomer("Bill", 100);
        System.out.println(vip2.getName() + " " + vip2.getCreditLimit() + " " + vip2.getEmail());
    }

}

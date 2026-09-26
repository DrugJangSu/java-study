public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50.0);

        bobsAccount.withdrawFunds(200.0);

        bobsAccount.depositFunds(100.0);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

    }


}

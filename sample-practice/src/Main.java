
    public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Avani", 3000);
            account.deposit(500);
            System.out.println("Balance: " + account.getBalance());
        }

}

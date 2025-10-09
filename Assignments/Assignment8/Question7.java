class Question7 {
    static class Account {
        String accountNumber;
        String holderName;
        double balance;
        Account(String accountNumber, String holderName, double balance) { this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance; }
    }
    private static Account[] accounts = new Account[100];
    private static int count = 0;
    public static void addAccount(Account a) { if (count < accounts.length) accounts[count++] = a; }
    public static void removeAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                for (int j = i; j < count - 1; j++) accounts[j] = accounts[j + 1];
                accounts[--count] = null;
                break;
            }
        }
    }
    public static boolean deposit(String accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                accounts[i].balance += amount;
                return true;
            }
        }
        return false;
    }
    public static boolean withdraw(String accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber.equals(accountNumber) && accounts[i].balance >= amount) {
                accounts[i].balance -= amount;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Account a1 = new Account("ACC1","John",5000);
        Account a2 = new Account("ACC2","Jane",3000);
        addAccount(a1);
        addAccount(a2);
        deposit("ACC1",1500);
        withdraw("ACC2",1000);
        for (int i = 0; i < count; i++) System.out.println(accounts[i].accountNumber + " " + accounts[i].holderName + " " + accounts[i].balance);
    }
}

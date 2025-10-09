class Question3 {
    private String accountNumber;
    private String holderName;
    private double balance;
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public void setBalance(double balance) { this.balance = balance; }
    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
    public static void main(String[] args) {
        Question3 acc = new Question3();
        acc.setAccountNumber("123456");
        acc.setHolderName("Alice");
        acc.setBalance(10000.50);
        acc.display();
    }
}
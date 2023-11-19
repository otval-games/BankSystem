import java.util.ArrayList;

public class Balance {
    private String cardnum;
    private double balance;
    private ArrayList<BankOperations> operations = new ArrayList<>();
    Balance(String cardnum, double balance){
        this.cardnum=cardnum;
        this.balance=balance;
    }
    public void deposit(double amount) {
        balance+=amount;
        operations.add(new BankOperations("Deposit", amount));
    }
    public void withdraw(double amount) {
        balance-=amount;
        operations.add(new BankOperations("Withdraw", -amount));
    }
    public double getBalance() {
        return balance;
    }
    public String getCardnum() {
        return cardnum;
    }

    public void prOperInfo(){
        for (int i = 0; i < operations.size(); i++) {
            System.out.println(getCardnum() +" operations: "+ getOperations().get(i).type+", amount: $"+getOperations().get(i).amount);
        }
    }
    public ArrayList<BankOperations> getOperations() {
        return operations;
    }
}

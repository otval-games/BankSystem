import java.util.ArrayList;

public class Client {
    String username;
    private ArrayList<Balance> balanceList = new ArrayList<>();
    Client(String name, String adress){
        this.username=name;
    }
    public void addBal(Balance balance){
        balanceList.add(balance);
    }

    public void transfer(Balance sourcebal, Balance targetbal, double amount){
        if (sourcebal.getBalance() >= amount){
            System.out.println("Transfer confirmed");
            sourcebal.withdraw(amount);
            targetbal.deposit(amount);
        }
        else {
            System.out.println("Not enough money");
        }
    }
}

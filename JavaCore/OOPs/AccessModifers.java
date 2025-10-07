package JavaCore.OOPs;

public class AccessModifers {
    
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.username = "Sumit Singh";
        System.out.println("The uername is: " + ba.username);
    }
}

class BankAccount {
    public String  username;
    private String password;
}
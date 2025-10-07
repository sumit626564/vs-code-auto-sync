package JavaCore.OOPs;

public class AccessModifers {
    BankAccount ba = new BankAccount();
    ba.username = "Sumit Singh";
}

class BankAccount {
    public String  username;
    private String password;
}
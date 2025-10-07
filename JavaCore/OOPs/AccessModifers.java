package JavaCore.OOPs;

public class AccessModifers {
    
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.username = "Sumit Singh";
        System.out.println("The uername is: " + ba.username);
        // if you  try to access the pass word , so then you can't able to access password

    }
}

class BankAccount {
    public String  username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}
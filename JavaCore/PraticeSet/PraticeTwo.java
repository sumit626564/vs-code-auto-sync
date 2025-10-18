package JavaCore.PraticeSet;

class Monopoly{
    private int profitsP;
    private int profitsQ;
    private int profitsR;
    private int profitsS;

    private int companyA;
    private int companyB;
    private int companyC;
    private int companyD;

    public void Profits(int profitsA, int profitsB, int profitsC, int profitsD){
        this.profitsP = profitsA;
        this.profitsQ = profitsB;
        this.profitsR = profitsC;
        this.profitsS = profitsD;
    }

    public void ProfitCalculation(int compnayA, int compnayB, int companyC, int companyD){
        compnayA = profitsQ + profitsR + profitsS;
        companyB = profitsP + profitsR + profitsS;
        companyC = profitsP + profitsQ + profitsS;
        companyD = profitsP + profitsQ + profitsR;
    }
    public String DataReleased(){
        if (profitsP > companyA || profitsQ > companyB || profitsR > companyC || profitsS > companyD) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class PraticeTwo {
    public static void main(String[] args){

    }
}

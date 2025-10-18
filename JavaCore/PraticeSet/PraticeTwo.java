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
        int compnayA = profitsQ + profitsR + profitsS;
        int companyB = profitsP + profitsR + profitsS;
        int companyC = profitsP + profitsQ + profitsS;
        int companyD = profitsP + profitsQ + profitsR;
    }
    public String DataReleased(){
        if(compnayA > compnayB && compnayA > companyC && compnayA && companyD){
            return "Yes";
        }else if(compnayB > compnayA && compnayB > companyC && compnayB > companyD){
            return
        }
        else{
            return "No"
        }
    }
}

public class PraticeTwo {
    public static void main(String[] args){

    }
}

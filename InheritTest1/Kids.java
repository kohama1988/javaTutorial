package InheritTest1;

public class Kids extends ManKind {
    private int yearsOld;

    public Kids(){
        
    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public void PrintAge(){
        System.out.println("I am "+yearsOld + "years old.");
    }

    public int getYearsOld(){
        return yearsOld;
    }
    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }
}

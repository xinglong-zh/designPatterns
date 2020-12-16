package demo_strategy;

public class ContextC {
    Calculator calculator;
    public ContextC(Calculator calculator){
        this.calculator = calculator;
    }

    public int exec(int a,int b,String symbol){
       return this.calculator.exec(a,b);
    }
}

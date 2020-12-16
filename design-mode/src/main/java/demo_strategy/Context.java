package demo_strategy;

/**
 * 承载策略的地方
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operator(){
        this.strategy.operate();
    }
}

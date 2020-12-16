package demo_strategy;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("断后");
    }
}

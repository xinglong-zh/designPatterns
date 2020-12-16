package demo_strategy;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("开绿灯");
    }
}

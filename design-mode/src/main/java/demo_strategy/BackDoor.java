package demo_strategy;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("请国老开后门");
    }
}

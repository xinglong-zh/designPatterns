package demo_strategy;

public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}

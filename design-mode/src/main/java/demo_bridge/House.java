package demo_bridge;

public class House extends Product{
    @Override
    void beProduced() {
        System.out.println("房子被生产");
    }

    @Override
    void beSell() {
        System.out.println("房子销售出去了");

    }
}

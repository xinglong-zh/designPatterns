package demo_bridge;

public class IPod extends Product{
    @Override
    void beProduced() {
        System.out.println(" ipod 被生产");
    }

    @Override
    void beSell() {
        System.out.println("ipod 被销售");

    }
}

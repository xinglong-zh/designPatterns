package demo_bridge;

public class HouseCorp extends Corp{
    @Override
    void produce() {
        System.out.println("房地产公司盖房子");
    }

    @Override
    void sell() {
        System.out.println("房地产公司卖房子");
    }

    /**
     *
     */
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚钱了");
    }
}

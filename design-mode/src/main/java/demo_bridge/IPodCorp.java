package demo_bridge;

public class IPodCorp extends Corp {

    @Override
    void produce() {
        System.out.println("生产ipod");
    }

    @Override
    void sell() {
        System.out.println("销售ipod");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("赚钱");
    }
}

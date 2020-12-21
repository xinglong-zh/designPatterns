package demo_bridge;

public class ClothesCorp extends Corp{
    @Override
    void produce() {
        System.out.println("服装公司生产");
    }

    @Override
    void sell() {
        System.out.println("服装公司销售");

    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚钱了");
    }
}

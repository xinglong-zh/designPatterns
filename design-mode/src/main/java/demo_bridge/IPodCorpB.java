package demo_bridge;

public class IPodCorpB extends CorpB{
    public IPodCorpB(IPod iPod) {
        super(iPod);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("ipod 工厂赚钱了");
    }
}

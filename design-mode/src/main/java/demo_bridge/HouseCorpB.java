package demo_bridge;

public class HouseCorpB extends CorpB{
    public HouseCorpB(House house) {
        super(house);
    }


    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚钱了");
    }
}

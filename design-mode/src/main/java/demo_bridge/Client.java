package demo_bridge;

/**
 * 场景类
 * 公司和产品之间 绑定太死 , 需要松散一点
 *
 * 桥梁模式（Bridge Pattern）也叫做桥接模式，是一个比较简单的模式，其定义如下：
 * Decouple an abstraction from its implementation so that the two can vary independently.（将抽象和
 * 实现解耦，使得两者可以独立地变化。）
 */
public class Client {
    public static void main(String[] args) {
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();


        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();

        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();

        System.out.println("----------------桥梁模式----------------");

        CorpB corpB = new HouseCorpB(new House());
        corpB.makeMoney();
    }
}

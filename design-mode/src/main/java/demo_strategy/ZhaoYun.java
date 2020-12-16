package demo_strategy;

/**
 * Define a family of algorithms,encapsulate each one,and make them interchangeable.（定义一组
 * 算法，将每个算法都封装起来，并且使它们之间可以互换。）
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        IStrategy strategy = new BackDoor();
        context = new Context(strategy);
        context.operator();



        strategy = new GivenGreenLight();
        context = new Context(strategy);
        context.operator();


        strategy = new BlockEnemy();
        context = new Context(strategy);
        context.operator();
    }
}

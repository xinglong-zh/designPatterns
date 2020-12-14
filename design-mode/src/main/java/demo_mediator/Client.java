package demo_mediator;

/**
 * 耦合性太强, 每个类都和其他的类有交流 , 违反了迪米特法则 , 每个类了解其他类越少越好.
 * 改用中介模式 .
 * 每个类只处理和自己有关的活动 , 与自己无关的 丢给中介者处理 .
 * 多个对象相互依赖的情况下 , 加入中介者,取消了多个对象间的依赖 .
 *
 * Define an object that encapsulates how a set of objects
 * interact.Mediator promotes loose coupling by keeping objects from referring to each other
 * explicitly,and it lets you vary their interaction independently.（用一个中介对象封装一系列的对象
 * 交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它
 * 们之间的交互。）
 * 中介者模式适
 * 用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构。在
 * 这种情况下一定要考虑使用中介者模式，这有利于把蜘蛛网梳理为星型结构，使原本复杂混
 * 乱的关系变得清晰简单。
 */
public class Client {
    public static void main(String[] args) {
//        Purchase purchase = new Purchase();
//        purchase.buyIBMComputer(100);
//
//        Sale sale = new Sale();
//        sale.saleIMBComputer(1);
//
//        Stock stock = new Stock();
//        stock.clearStock();
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);

        purchase.buyIBMComputer(100);

        Sale sale = new Sale(mediator);
        sale.saleIMBComputer(10);

        Stock stock = new Stock(mediator);

        stock.clearStock();
    }
}

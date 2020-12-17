package demo_state;

/**
 * 状态模式
 * <p>
 * Allow an object to alter its behavior when its internal state changes.The object will appear to
 * change its class.（当一个对象内在状态改变时允许其改变行为，这个对象看起来像改变了其
 * 类。）
 * <p>
 * 核心是封装 ,状态的变更改变了行为的变更 , 从外部看起来是这个对象对应的类发生了改变一样 .
 *
 * 状态模式适用于当某个对象在它的状态发生改变时，它的行为也随着发生比较大的变
 * 化，也就是说在行为受状态约束的情况下可以使用状态模式，而且使用时对象的状态最好不
 * 要超过5个。
 *
 * todo :: 还需要在看 .
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();

        lift.open();
        lift.close();
        lift.run();
        lift.stop();

        System.out.println("----------------------------------");

        Context context = new Context();
        // 关门状态下
        context.setLifeState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

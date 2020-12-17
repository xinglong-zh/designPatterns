package demo_state;

/**
 * 这个状态是如何产生的，以及在这个状态下还能做什么其他动作
 *
 *
 * 判断逻辑复杂 , 使用状态模式
 */
public interface ILift {
    /**
     * 定义电梯的状态
     */
    final static int OPENING_STATE = 1;
    final static int CLOSING_STATE = 2;
    final static int RUNNING_STATE = 3;
    final static int STOPPING_STATE = 4;

    public void setState(int state);

    /**
     * 电梯开门
     */
    void open();

    /**
     * 电梯关门
     */
    void close();

    /**
     * 电梯运行
     */
    void run();

    /**
     * 电梯停止
     */
    void stop();
}

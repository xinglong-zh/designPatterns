package demo_state;

public class StoppingState extends LifeState {
    @Override
    public void open() {
        // 关门可以开门

        super.getContext().setLifeState(Context.openingState);
        super.getContext().getLifeState().open();
    }

    @Override
    public void close() {
        // 关门close 不做操作
    }

    @Override
    public void run() {
        super.getContext().setLifeState(Context.runningState);
        super.getContext().getLifeState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
    }
}

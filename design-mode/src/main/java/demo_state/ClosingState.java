package demo_state;

public class ClosingState extends LifeState{
    @Override
    public void open() {
        super.getContext().setLifeState(Context.openingState); //设置为开门状态
        super.getContext().getLifeState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭");
    }

    @Override
    public void run() {
        super.getContext().setLifeState(Context.runningState);
        super.getContext().getLifeState().run();
    }

    @Override
    public void stop() {
        super.getContext().setLifeState(Context.stoppingState);
        super.getContext().getLifeState().stop();
    }
}

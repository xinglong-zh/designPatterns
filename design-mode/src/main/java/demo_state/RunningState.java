package demo_state;

public class RunningState extends LifeState{
    @Override
    public void open() {
        // 运行状态下 , 不执行操作
    }

    @Override
    public void close() {
        // 运行状态下, 关门不执行操作
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        super.getContext().setLifeState(Context.stoppingState);
        super.getContext().getLifeState().stop();
    }
}

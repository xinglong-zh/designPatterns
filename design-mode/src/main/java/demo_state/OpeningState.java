package demo_state;

public class OpeningState extends LifeState{
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.getContext().setLifeState(Context.closingState);
        super.getContext().getLifeState().close();

    }

    @Override
    public void run() {
        // do noting
    }

    @Override
    public void stop() {

        // do nothing

    }
}

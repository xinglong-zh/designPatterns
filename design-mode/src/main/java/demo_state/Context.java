package demo_state;

import lombok.Data;

/**
 * context 的作用是串联各个状态的过度
 */

@Data
public class Context {

    public final static OpeningState openingState = new OpeningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();


    /**
     * 定义当前电梯的状态
     */
    private LifeState lifeState;

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        this.lifeState.setContext(this);
    }

    void open() {
        this.lifeState.open();
    }

    void close() {
        this.lifeState.close();
    }

    void run() {
        this.lifeState.run();
    }

    void stop() {
        this.lifeState.stop();
    }
}

package demo_state;

import lombok.Data;

@Data
public abstract class LifeState {
    private Context context;

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();


}

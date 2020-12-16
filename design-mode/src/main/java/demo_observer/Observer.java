package demo_observer;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 更新状态
     * @param context
     */
    void update(String context);
}

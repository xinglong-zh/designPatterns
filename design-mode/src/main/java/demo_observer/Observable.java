package demo_observer;

/**
 * 被观察者 ,
 */
public interface Observable {
    /**
     * 添加一个观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 删除一个观察者
     * @param observer
     */
    void deleteObserver(Observer observer);

    /**
     * 通知所有的观察者
     * @param context
     */
    void notifyObservers(String context);
}

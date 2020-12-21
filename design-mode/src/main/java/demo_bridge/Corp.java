package demo_bridge;

/**
 * 抽象的公司模型
 */
public abstract class Corp {
    /**
     * 赚钱 , 生产 , 销售 才能赚钱 .
     */
    void makeMoney() {
        this.produce();
        this.sell();
    }

    /**
     * 生产
     */
    abstract void produce();

    /**
     * 销售
     */
    abstract void sell();
}

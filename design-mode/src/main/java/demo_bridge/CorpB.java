package demo_bridge;

public abstract class CorpB {
    private Product product;

    public CorpB(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        /** 生产 , */
        this.product.beProduced();
        /** 销售, */
        this.product.beSell();
    }
}

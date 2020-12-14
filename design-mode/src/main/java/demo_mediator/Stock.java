package demo_mediator;

/**
 * 仓库
 */
public class Stock extends AbstractColleague{
    private static int COMPUTER_COUNT = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        COMPUTER_COUNT +=number;
        System.out.println("库存数量为"+COMPUTER_COUNT);
    }

    public void decrease(int number) {
        COMPUTER_COUNT -=number;
        System.out.println("库存数量为"+COMPUTER_COUNT);
    }


    public int getStockNumber() {
        return COMPUTER_COUNT;
    }

    public void clearStock(){
//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
        System.out.println("清理库存容量"+COMPUTER_COUNT);
//        sale.offSale();
//        // 采购人员停止购买
//        purchase.refuseBuyIBM();
        super.getMediator().execute("stock.clear");

    }
}

package demo_mediator;

import java.util.Random;

/**
 * 销售
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 反映销售情况
     * @return
     */
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int  saleStatus = random.nextInt(100);
        System.out.println("销售情况为"+saleStatus);
        return saleStatus;
    }

    public void saleIMBComputer(int number){
//        Stock stock = new Stock();
//        Purchase purchase = new Purchase();
//        if (stock.getStockNumber()<number){
//            // 库存不足 , 需要采购
//            purchase.buyIBMComputer(number);
//        }
//        System.out.println("销售电脑"+number);
//        stock.decrease(number);
        super.getMediator().execute("sale.sell",number);
    }


    /**
     * 折价销售
     */
    public void offSale(){

//        Stock stock = new Stock();
//        System.out.println("折价销售所有电脑"+stock.getStockNumber());
        super.getMediator().execute("sale.offSell");

    }
}

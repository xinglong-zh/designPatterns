package demo_mediator;

/**
 * 采购
 */
public class Purchase  extends AbstractColleague{
    public Purchase(AbstractMediator mediator){
        super(mediator);
    }

    public void buyIBMComputer(int number){
//        Stock stock =new Stock();
//        Sale sale = new Sale();
//        int saleStatus = sale.getSaleStatus();
//        if (saleStatus>80){
//            // 销售状况良好
//            System.out.println("采购电脑数量"+number);
//        }else {
//            // 销售情况一般 ,折半采购
//            int buyNumber = number/2;
//            System.out.println("采购电脑数量"+buyNumber);
//        }
        super.getMediator().execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("拒绝采购ibm的电脑");
    }
}

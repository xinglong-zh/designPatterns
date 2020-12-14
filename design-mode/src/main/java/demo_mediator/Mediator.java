package demo_mediator;

/**
 * 中介者具体类,定义了多个private 方法 ,用来处理对象之间的依赖关系 .
 * 把原来一个对象依赖多个对象的情况 ,移动到中介private 方法中实现 .
 */
public class Mediator extends AbstractMediator{
    @Override
    public void execute(String str, Object... objects) {
        if ("purchase.buy".equals(str)){
            // 采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if ("sale.sell".equals(str)){
            // 销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if ("sale.offSell".equals(str)){
            // 折价处理
            this.offSell();
        }else if ("stock.clear".equals(str)){
            // 清仓处理
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.getSale().getSaleStatus();
        if (saleStatus>80){
            System.out.println("采购IBM 电脑"+number);
            super.getStock().increase(number);
        }else {
//            折半采购
            int buyNumber = number/2;
            System.out.println("采购电脑"+buyNumber);
            super.getStock().increase(buyNumber);
        }
    }

    private void sellComputer(int number){
        if(super.getStock().getStockNumber()<number){
            System.out.println("库存不够 , 需要采购电脑");
            super.getPurchase().buyIBMComputer(number);
        }

        super.getStock().decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售电脑"+super.getStock().getStockNumber());

    }

    private void clearStock(){
        super.getSale().offSale();
        super.getPurchase().refuseBuyIBM();
    }
}

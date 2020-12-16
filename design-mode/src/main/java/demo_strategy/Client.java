package demo_strategy;

/**
 * 策略模式是一个非常简单的模式。它在项目中使用得非常多，但它单独使用的地方就比
 * 较少了，因为它有致命缺陷：所有的策略都需要暴露出去，这样才方便客户端决定使用哪一
 * 个策略。
 */
public class Client {
    public static final String ADD_SYMBOL = "+";
    public static final String SUB_SYMBOL = "-";


    public static void main(String[] args) {
        ContextC contextC =null;
        int a = 100;
        int b = 200;
        String symbol = "+";
        if(symbol.equals(ADD_SYMBOL)){
            contextC = new ContextC(new Add());
        }else if (symbol.equals(SUB_SYMBOL)){
            contextC = new ContextC(new Sub());
        }

        System.out.println(contextC.exec(a,b,symbol));


        System.out.println(CalculatorEnum.SUB.exec(a,b));
    }
}

package demo_mediator;

import lombok.Data;

@Data
public abstract class AbstractMediator {
    private Purchase purchase;
    private Sale sale;
    private Stock stock;

    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str,Object ...objects);

}

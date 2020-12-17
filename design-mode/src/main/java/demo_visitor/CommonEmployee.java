package demo_visitor;

import lombok.Data;

@Data
public class CommonEmployee extends Employee{
    private String job;


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

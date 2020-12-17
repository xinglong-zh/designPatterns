package demo_visitor;

import lombok.Data;

@Data
public class Manager extends Employee{
    private String performance;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

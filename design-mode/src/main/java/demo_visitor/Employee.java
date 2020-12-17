package demo_visitor;

import lombok.Data;

@Data
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE=1;
    /**
     * 薪资
     */
    private int salary;
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private int sex;

    public abstract void accept(IVisitor visitor);
}

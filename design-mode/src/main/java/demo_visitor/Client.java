package demo_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 *
 * Represent an
 * operation to be performed on the elements of an object structure. Visitor lets you define a new
 * operation without changing the classes of the elements on which it operates. （封装一些作用于某种
 * 数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的
 * 操作。）
 */
public class Client {
    public static void main(String[] args) {

        for (Employee employee:mockEmployee()){
            employee.accept(new Visitor());
        }


    }

    public static List<Employee> mockEmployee(){
        List<Employee> employees = new ArrayList<>();
        CommonEmployee zhangsan = new CommonEmployee();

        zhangsan.setJob("美工");
        zhangsan.setName("张三");
        zhangsan.setSalary(100);
        zhangsan.setSex(1);

        Manager lisi = new Manager();
        lisi.setName("李四");
        lisi.setSalary(200);
        lisi.setSex(1);
        lisi.setPerformance("xxxx");


        employees.add(zhangsan);
        employees.add(lisi);

        return employees;
    }
}

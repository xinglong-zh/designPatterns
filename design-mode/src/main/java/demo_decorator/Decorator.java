package demo_decorator;

import lombok.Data;

/**
 * 装饰者
 * 装饰类,还是把动作的执行者 , 委托给需要装饰的对象
 */
@Data
public abstract class Decorator extends SchoolReport{
    private SchoolReport schoolReport;
    public Decorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }

    public void report(){
        this.schoolReport.report();
    }

    public void sign(String name){
        this.schoolReport.report();
    }
}


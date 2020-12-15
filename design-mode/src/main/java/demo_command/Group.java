package demo_command;

/**
 * @author Administrator
 */
public abstract class Group {
    /**
     * 找人
     */
    abstract public void find();

    /**
     * 增加
     */
    abstract public void add();

    /**
     * 删除
     */
    abstract public void delete();

    /**
     * 改变
     */
    abstract public void change();

    /**
     * 计划
     */
    abstract public void plan();

    /**
     * 根据事务进行回滚
     */
    public void rollback(){
            // 执行一些回滚的操作
        System.out.println("执行回滚操作");
    }



}

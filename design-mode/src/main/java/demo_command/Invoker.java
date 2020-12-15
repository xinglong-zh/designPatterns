package demo_command;

import lombok.Data;

/**
 * @author Administrator
 * 命令模式的执行者
 * 接到一个封装好的命令 . 直接执行
 */
@Data
public class Invoker {
    private Command command;
    void Action(){
        this.command.execute();
    }
}

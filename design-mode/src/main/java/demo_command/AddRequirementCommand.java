package demo_command;

/**
 * @author Administrator
 * 增加需求的命令
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.getRequirementGroup().find();
        super.getRequirementGroup().add();
        super.getRequirementGroup().plan();

        super.getPageGroup().add();
        super.getPageGroup().plan();

        super.getCodeGroup().add();
        super.getCodeGroup().plan();
    }
}

package demo_command;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public abstract class Command {
    private RequirementGroup requirementGroup = new RequirementGroup();
    private CodeGroup codeGroup = new CodeGroup();
    private PageGroup pageGroup = new PageGroup();

    /**
     * 执行命令
     */
   public abstract void execute();
}

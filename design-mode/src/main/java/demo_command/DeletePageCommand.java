package demo_command;

/**
 * @author Administrator
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.getPageGroup().find();
        super.getPageGroup().delete();
        super.getPageGroup().plan();
    }
}

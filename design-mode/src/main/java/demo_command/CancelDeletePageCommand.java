package demo_command;

/**
 * @author Administrator
 */
public class CancelDeletePageCommand  extends Command{
    @Override
    public void execute() {
        super.getPageGroup().rollback();
    }
}

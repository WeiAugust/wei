package 行为型.命令模式.template;

/**
 * @ClassName ConcreteCommand
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:44
 * @Version 1.0
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver;
    public ConcreteCommand() {
        receiver = new Receiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}

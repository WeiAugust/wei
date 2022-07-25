package 行为型.命令模式.template;

/**
 * @ClassName Invoker
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:43
 * @Version 1.0
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行command...");
        command.execute();
    }
}

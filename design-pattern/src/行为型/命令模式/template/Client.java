package 行为型.命令模式.template;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:48
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.call();
    }
}

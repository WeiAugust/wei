package 行为型.责任链模式.template;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 19:05
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        handler1.setNext(handler2);
        handler1.handleRequest("hello");
    }
}

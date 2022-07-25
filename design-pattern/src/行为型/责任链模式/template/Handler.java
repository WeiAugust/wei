package 行为型.责任链模式.template;

/**
 * @ClassName Handler
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 19:03
 * @Version 1.0
 **/
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handleRequest(String request);
}

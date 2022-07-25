package 行为型.命令模式.example;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:56
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Cooker cooker = new ChinaCooker();
        Breakfast breakfast = new ChinaBreakfast(cooker);
        Waiter waiter = new Waiter(breakfast);
        waiter.order();
    }
}

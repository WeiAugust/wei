package 行为型.命令模式.example;

/**
 * @ClassName Waiter
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:51
 * @Version 1.0
 **/
public class Waiter {

    private Breakfast breakfast;

    public Waiter(Breakfast breakfast) {
        this.breakfast = breakfast;
    }

    public void order() {
        breakfast.cooking();
    }
}

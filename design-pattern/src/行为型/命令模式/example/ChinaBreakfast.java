package 行为型.命令模式.example;

/**
 * @ClassName ChinaBreakfast
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:57
 * @Version 1.0
 **/
public class ChinaBreakfast implements Breakfast {

    private Cooker cooker;

    public ChinaBreakfast(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cooking() {
        cooker.doCook();
    }
}

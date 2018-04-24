/**
 * 测试装饰者模式
 * Created by Administrator on 2018.4.23.
 */
public class TestWapper {
    public static void main(String[] args) {
        Coffee mCoffee = new SimpleCoffee();
        mCoffee = new SugarDecorator(mCoffee);
        mCoffee = new MilkDecorator(mCoffee);
        int price1 = mCoffee.getPrice();
        System.out.println("price1="+price1);
    }
}

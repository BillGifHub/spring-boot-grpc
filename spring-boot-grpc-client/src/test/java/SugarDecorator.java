/**
 * Created by Administrator on 2018.4.23.
 */
public class SugarDecorator extends Decoractor{

    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return coffee.getPrice() + 10;
    }
}

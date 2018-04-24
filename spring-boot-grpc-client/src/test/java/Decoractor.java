/**
 * Created by Administrator on 2018.4.23.
 */
public abstract class Decoractor extends Coffee {
    protected Coffee coffee;

    Decoractor(Coffee coffee) {
        this.coffee = coffee;
    }
}

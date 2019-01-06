package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class cashNormal implements ICashSuper{

    public cashNormal(){

    }

    @Override
    public double getCashCount(double money) {
        return money;
    }
}

package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class CashNormal implements ICashSuper{

    public CashNormal(){

    }

    @Override
    public double getCashCount(double money) {
        return money;
    }
}

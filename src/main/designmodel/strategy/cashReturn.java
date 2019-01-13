package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class CashReturn implements ICashSuper {

    private double limit;
    private double back;

    public CashReturn(double limit, double back) {
        this.limit = limit;
        this.back = back;
    }

    @Override
    public double getCashCount(double money) {

        return money > limit ? money - back : money;
    }
}

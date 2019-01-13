package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class CashRebate implements ICashSuper {

    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double getCashCount(double money) {

        return money * this.rebate;
    }
}

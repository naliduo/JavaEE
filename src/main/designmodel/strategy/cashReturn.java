package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class cashReturn implements ICashSuper {

    private double limit;
    private double back;

    public cashReturn(double limit, double back) {
        this.limit = limit;
        this.back = back;
    }

    @Override
    public double getCashCount(double money) {

        return money > limit ? money - back : money;
    }
}

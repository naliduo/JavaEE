package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class cashContext {
    ICashSuper cs;

    public cashContext(String type) {
        switch (type) {
            case "正常付费":
                cs = new cashNormal();
                break;
            case "满300减50":
                cs = new cashReturn(300, 50);
                break;
            case "打8折":
                cs = new cashRebate(0.8);
                break;
        }
    }

    public double getCount(double money) {
        return cs.getCashCount(money);
    }
}

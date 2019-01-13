package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class CashContext {
    ICashSuper cs;

    public CashContext(String type) {
        switch (type) {
            case "正常付费":
                cs = new CashNormal();
                break;
            case "满300减50":
                cs = new CashReturn(300, 50);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
        }
    }

    public double getCount(double money) {
        return cs.getCashCount(money);
    }
}

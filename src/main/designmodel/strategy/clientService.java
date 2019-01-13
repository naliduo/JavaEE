package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class ClientService {
    public static void main(String[] args) {
        CashContext CashContext = new CashContext("正常付费");
        System.out.println("正常付费：" + CashContext.getCount(500));
        CashContext cashContext1 = new CashContext("满300减50");
        System.out.println("满300减50：" + cashContext1.getCount(500));
        CashContext cashContext2 = new CashContext("打8折");
        System.out.println("打8折：" + cashContext2.getCount(500));
    }
}

package main.designmodel.strategy;

/**
 * Created by lilk on 2019/1/6.
 */
public class clientService {
    public static void main(String[] args) {
        cashContext cashContext = new cashContext("正常付费");
        System.out.println("正常付费：" + cashContext.getCount(500));
        cashContext cashContext1 = new cashContext("满300减50");
        System.out.println("满300减50：" + cashContext1.getCount(500));
        cashContext cashContext2 = new cashContext("打8折");
        System.out.println("打8折：" + cashContext2.getCount(500));
    }
}

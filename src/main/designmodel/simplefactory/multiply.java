package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class multiply extends operator {
    @Override
    public int getResult() {
        return super.a * super.b;
    }
}

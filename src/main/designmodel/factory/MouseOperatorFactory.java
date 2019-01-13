package main.designmodel.factory;

/**
 * Created by lilk on 2019/1/13.
 */
public class MouseOperatorFactory implements IOperatorFactory {
    @Override
    public Operator getOperator() {
        return new MouseOperator();
    }
}

package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class OperatorFactory {

    public static Operator getOperator(String operatorType) {
        Operator Operator;
        switch (operatorType) {
            case "+":
                Operator = new Plus();
                break;
            case "-":
                Operator = new Mouse();
                break;
            case "*":
                Operator = new Multiply();
                break;
            case "/":
                Operator = new Divide();
                break;
            default:
                Operator = null;
                break;
        }
        return Operator;

    }
}
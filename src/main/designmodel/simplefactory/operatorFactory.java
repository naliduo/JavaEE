package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class operatorFactory {

    public static operator getOperator(String operatorType) {
        operator operator;
        switch (operatorType) {
            case "+":
                operator = new plus();
                break;
            case "-":
                operator = new mouse();
                break;
            case "*":
                operator = new multiply();
                break;
            case "/":
                operator = new divide();
                break;
            default:
                operator = null;
                break;
        }
        return operator;

    }
}
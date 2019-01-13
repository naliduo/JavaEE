package main.designmodel.factory;

import java.util.Scanner;

/**
 * Created by lilk on 2019/1/13.
 */
public class ClientDomain {
    public static void main(String[] args) {
        IOperatorFactory operatorFactory;
        String type= new Scanner(System.in).next();
        switch (type) {
            case "+":
                operatorFactory = new AddOperatorFactory();
                break;
            case "-":
                operatorFactory = new MouseOperatorFactory();
                break;
            case "*":
                operatorFactory = new MultiplyOperatorFactory();
                break;
            case "/":
                operatorFactory = new DivideOperatorFactory();
                break;
            default:
                operatorFactory = new AddOperatorFactory();
                break;
        }
        Operator operator = operatorFactory.getOperator();
        operator.a = 1;
        operator.b = 2;
        System.out.println(operator.getResult());
    }
}

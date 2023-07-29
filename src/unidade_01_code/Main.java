package unidade_01_code;

import unidade_01_code.modelo.RegressaoLinear;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegressaoLinear regressaoLinear = new RegressaoLinear();
        List<Double> X = List.of(1.0,2.0,6.0);
        List<Double> Y = List.of(9.0,10.0,14.0);
        regressaoLinear.calcularBeta1(X,Y);
        regressaoLinear.calcularBeta0(X,Y,regressaoLinear.getBeta1());

        double x_test = 9.0;
        double predict = regressaoLinear.predictY(x_test);
        System.out.println("Regressao Linear:\n - X: " + x_test + "\n - Beta1: " + regressaoLinear.getBeta1() + "\n - Beta0: "+ regressaoLinear.getBeta0()+"\n - Predict: " +predict);
    }
}
package unidade_01_code.modelo;

import java.util.List;

public class RegressaoLinear {
    private static double beta1;
    private static double beta0;
    public RegressaoLinear(){
        beta0 = 0;
        beta1 = 0;
    }
    private static double calcularMedia(List<Double> numeros){
        double soma = 0;
        for(Double numero : numeros){
            soma += numero;
        }
        return soma / numeros.size();
    }
    public void calcularBeta1(List<Double> X,List<Double> Y){
        double mediaX = calcularMedia(X);
        double mediaY = calcularMedia(Y);

        double somaXY = 0;
        double somaXX = 0;

        for (int i = 0; i < X.size();i++){
            double xi = X.get(i);
            double yi = Y.get(i);

            somaXY += (xi - mediaX) * (yi - mediaY);
            somaXX += (xi - mediaX) * (xi - mediaX);
        }
         beta1 = somaXY / somaXX;
    }

    public void calcularBeta0(List<Double> X, List<Double> Y,double beta1){
        double mediaX = calcularMedia(X);
        double mediaY = calcularMedia(Y);

        beta0 = mediaY - beta1 * mediaX;
    }

    public double predictY(double X){
        return beta0 + beta1 * X;
    }
    public double getBeta1() {
        return beta1;
    }
    public double getBeta0(){
        return  beta0;
    }



}

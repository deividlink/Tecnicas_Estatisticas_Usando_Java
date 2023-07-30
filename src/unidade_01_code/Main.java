package unidade_01_code;
/*
* @project unidade_01_code
* @author Deivid K. Lima
*/
import unidade_01_code.modelo.DesvioPadrao;
import unidade_01_code.modelo.MediaAritmetica;
import unidade_01_code.modelo.RegressaoLinearSimples;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegressaoLinearSimples regressaoLinear = new RegressaoLinearSimples();
        List<Double> X = List.of(1.0,2.0,6.0);
        List<Double> Y = List.of(9.0,10.0,14.0);
        regressaoLinear.calcularBeta1(X,Y);
        regressaoLinear.calcularBeta0(X,Y,regressaoLinear.getBeta1());
        double x_test = 9.0;
        double predict = regressaoLinear.predictY(x_test);
        System.out.println("Regressao Linear: - X: " + x_test + " - Beta1: " + regressaoLinear.getBeta1() + " - Beta0: "+ regressaoLinear.getBeta0()+" - Predict: " +predict);


        double [] x_test3 = {10.0,11.0,12.0};
        MediaAritmetica mediaAritmetica = new MediaAritmetica(x_test3);
        System.out.print("Teste3: ");
            for(double x: x_test3) {
                System.out.print(x + " ");
            }
        System.out.println("Media :" + mediaAritmetica.calcular());

        DesvioPadrao desvioPadrao = new DesvioPadrao();
        List<Double> x_teste4 = List.of(10.0,25.0,45.0);
        desvioPadrao.setDados(x_teste4);
        System.out.println("Teste4: " + x_teste4 + " - Desvio: " +  desvioPadrao.calcularDesvio());

    }
}

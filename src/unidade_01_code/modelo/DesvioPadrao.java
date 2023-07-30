package unidade_01_code.modelo;

import java.util.ArrayList;
import java.util.List;

public class DesvioPadrao {
    private List<Double> dados;
    public DesvioPadrao(){
        this.dados = new ArrayList<>();
    }
    public void setDados(List<Double> _dados){
        this.dados = _dados;
    }

    public double calcularDesvio() {
        int n = dados.size();
        double media = 0.0;
        for(double numero: dados){
            media += numero;
        }
        media /= n;
        // Calcula a soma dos quadrados das diferenças entre cada valor e a média
        double somaQuadradoDiferencas = 0.0;
        for(double numero: dados){
            double diferenca = numero - media;
            somaQuadradoDiferencas += diferenca * diferenca;
        }
        // Divide a soma dos quadrados pela quantidade de valores menos um
        double variancia = somaQuadradoDiferencas / (n - 1);
        // Calcula o desvio padrão como a raiz quadrada da variância
        return Math.sqrt(variancia);
    }

}

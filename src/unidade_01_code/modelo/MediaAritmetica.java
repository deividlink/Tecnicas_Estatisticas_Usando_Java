package unidade_01_code.modelo;

public class MediaAritmetica {
    private double[] num;
    public MediaAritmetica(double[] numeros){
        this.num = numeros;
    }
    public double calcular(){
        if(num == null || num.length == 0){
            throw new IllegalArgumentException("A Lista de Números nao Pode estar Vazia");
        }
        double soma = 0;
        for (double numero: num){
            soma += numero;
        }
        return soma / num.length;
    }
}

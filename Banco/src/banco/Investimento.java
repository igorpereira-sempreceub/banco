package banco;

public class Investimento {
    public float rentabilidade;
    public int valorMinimo;
    
    public float aplicar(float valor, int meses){
        float resultado = 0.0f;
        for (int i = 1; i <= meses; i++) {
            resultado += valorar(valor);
            valor += resultado;
        }
        return resultado + valor;
    }
    
    public float valorar(float valor){
        valor = rentabilidade * valor;
        return valor;
    }

}

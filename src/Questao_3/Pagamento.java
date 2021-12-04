package Questao_3;

public class Pagamento {
    private double resultado;

    public  double pagamentoPendente() {
        if(isAtrasado()) {
            resultado = pagamentoAtrasado();
        } else {
            resultado = pagamentoNormal();
        }
        return resultado;
    }

    public  double efetuarPagamento() {
        if (isPreparado()) {
            resultado = pagamentoPreparado();
        } else if (isEmAberto()) {
            resultado = pagamentoEmAberto();
        }
        return resultado;
    }
}

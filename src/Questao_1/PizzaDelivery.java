package Questao_1;

public class PizzaDelivery {
    public int entregasPendenetes(int entregasAtrasadas) {
        if (entregasAtrasadas > 5) {
            return entregadores(2);
        } else {
            return entregadores(1);
        }
    }
    public int entregadores(int quantidadeDeEntregadores) {
        return quantidadeDeEntregadores;
    }
}

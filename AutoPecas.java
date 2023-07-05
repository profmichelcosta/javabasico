public class AutoPecas
{
    public static void main(String[] args){
        float precoAmortecedor = 500.00f;
        float precoPneu = 300.00f;
        float precoBateria = 300.00f;
        float ValorTotal = 0;
        ValorTotal= precoAmortecedor+ precoPneu+ precoBateria/10;
        System.out.println("----###   SISTEMA DE AUTOPEÇAS  ------------#####");
        System.out.println("AMORTECEDOR: "+ precoAmortecedor);
        System.out.println("PNEU: "+ precoPneu);
        System.out.println("AMORTECEDOR: "+ precoAmortecedor);
        System.out.println("bateria: "+ precoBateria);
        System.out.println("VALOR TOTAL: "+ ValorTotal);
        System.out.println("");
        System.out.println("");
    }
}

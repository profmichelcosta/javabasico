public class Recursao{
    public static void main(String[] args) {
        int result = soma(1,2);
        System.out.println(result);
    }

    public static int soma(int inicio, int fim) {
        if (fim > inicio) {
            int result = fim + soma(inicio, fim - 1);
            System.out.println("Recursão: "+result );
            return fim + soma(inicio, fim - 1);
        } else {
            return fim;
        }
    }
}

/**
 * Escreva uma descrição da classe MetodosFuncoes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MetodosFuncoes
{
    static void helloWord() {
        System.out.println("Ola, o Método ou Função helloWord() foi Executado com sucesso!");
    }

    static int Somar(int a, int b){
        return a+b;
    }

    static int Subtrair(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        helloWord();
        Somar(1000, 10);
        Subtrair(100, 9);
    }
}


/**
 * Escreva uma descrição da classe MatrizMultidim aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MatrizMultidim
{
    public static void main(String[] args){
       String[][] carros = {{"Volvo", "BMW", "Ford", "Fiat"},{"Citroen", "Mazda", "Renault", "VolksWagen"}};
       for (int i = 0; i < carros.length; i++) {
          for(int j = 0; j < carros[i].length; j++) {
            System.out.println(carros[i][j]);
          }
       }
   }
}

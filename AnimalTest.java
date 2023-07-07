public class Animal{
    static String Especie;
    static String tipoAnimal;
    static int patas;
    static int idade;
    static String comunicacao;
    public Animal(){
    }
    public Animal(String especie, String tipoanimal, int patas, int idade, String comunicacao){
        this.Especie = especie;
        this.tipoAnimal = tipoanimal;
        this.patas = patas;
        this.idade=idade;
        this.comunicacao = comunicacao;
        imprimirAnimal();
    }
    public static void imprimirAnimal(){
       System.out.println("__________________________________________________________________________________________________________");
        System.out.println("Especie do animal: "+Especie+"  Tipo: "+tipoAnimal
            +" Patas: "+patas+" Idade: "+idade + " Comunicação do animal: "+ comunicacao);

               System.out.println("___________________________________________________________________________________________________");
    }
}

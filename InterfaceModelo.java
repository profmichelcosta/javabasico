interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

class Porco implements Animal {
  public void animalSound() {
    System.out.println("O porco faz: Oinc Oinc Oincc!");
  }
  public void sleep() {
    System.out.println("Quando Dorme: Ronca muito");
  }
}
class Main {
  public static void main(String[] args) {
    Porco myPig = new Porco();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
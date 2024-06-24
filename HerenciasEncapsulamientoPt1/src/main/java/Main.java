
public class Main {
  public static void main(String[] args) {
    // Declarando la class Animal
    Animal info = new Animal("Perro");
    // Insertando Pato usando SetNombre
    info.setNombre("Pato");
    // Imprimiendo el nombre de la class Animal
    System.out.println("Declaramos el animal: " + info.getNombre()); 
    // vamos a llamar el metodo getSound
    System.out.println("El sonido del animal es: \n");
    info.makeSound("Cuak");

    Perro info2 = new Perro("Gato", 5, "Labrador", 10);
    info2.makeSound("Miau");
  }
}
public class Animal { 
  public String nombre;
  // Constructor
  public Animal(String nombre) {
    this.nombre = nombre; 
  }

  // Metodo donde el animal genera un sonido
  public static void makeSound(String sound) {
    System.out.println("Hace el sonido: " + sound);
  }

  // Getters
  public String getNombre() {
      return nombre;
  }

  // Setters
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  
}
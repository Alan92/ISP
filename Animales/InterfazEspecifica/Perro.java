/** A pesar de no que hay metodos que no sirven para nada estamos obligados a implementarlos */
public class Perro implements Animal, I_Ladrar, I_Correr {
    public void ladrar() { 
      System.out.println("Soy un perro y ladro toda la noche"); 
    }
    public void correr() {
      System.out.println("Soy un perro y corro detras de los coches");
    }
    public void comer() {
      System.out.println("Soy un perro y como deberes");
    }
    public void beber() {
      System.out.println("Soy un perro y bebo como tal");
    }
}
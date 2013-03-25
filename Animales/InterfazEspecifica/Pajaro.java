/** A pesar de no que hay metodos que no sirven para nada estamos obligados a implementarlos */
public class Pajaro implements Animal, I_Volar {
    public void volar() {
      System.out.println("Soy un pájaro por lo que puedo volar");
    }
    public void maullar() {
      /* Los pajaros no maullan */ 
    }
    public void comer() {
      System.out.println("Soy un pájaro y como gusanos");
    }
    public void beber() {
      System.out.println("Soy un pájaro y bebo como un tal");
    }
}
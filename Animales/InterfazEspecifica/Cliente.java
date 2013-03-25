public class Cliente {
  public static void main(String args[]) {
    Perro perro = new Perro();
    Gato gato = new Gato();
    Pajaro pajaro = new Pajaro();

    /** Acciones del perro */
    perro.correr();
    perro.ladrar();
    perro.comer();
    perro.beber();
    System.out.println("");

    /** Acciones del gato */
    gato.correr();
    gato.maullar();
    gato.comer();
    gato.beber();
    System.out.println("");
    /** Acciones del pajaro */
    pajaro.volar();
    pajaro.comer();
    pajaro.beber();
  }
}
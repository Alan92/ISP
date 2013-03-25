public class Cliente {
  public static void main(String args[]) {
    Perro perro = new Perro();
    Gato gato = new Gato();
    Pajaro pajaro = new Pajaro();

    /** Acciones del perro */
    perro.volar();
    perro.correr();
    perro.ladrar();
    perro.maullar();
    perro.comer();
    perro.beber();
    System.out.println("");

    /** Acciones del gato */
    gato.volar();
    gato.correr();
    gato.ladrar();
    gato.maullar();
    gato.comer();
    gato.beber();
    System.out.println("");

    /** Acciones del pajaro */
    pajaro.volar();
    pajaro.correr();
    pajaro.ladrar();
    pajaro.maullar();
    pajaro.comer();
    pajaro.beber();
  }
}
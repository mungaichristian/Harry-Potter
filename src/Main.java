public class Main {
   public static void main(String[] args) {
      System.out.println("Hello world!");
      /*
    - classe personaggio
     - sotto classe mago
     - attributi: nome, età, casata, maschio o femmina
     - valore di forze e di difesa
       */

      Personaggio obj1 = new Mago("Albus Silente ",70,'M', 9.6, 8.5, "Griffondoro");
      Personaggio obj2 = new Mago ( "severus piton ", 50, 'M', 9.1, 9.2, "serpe verde ");
      Personaggio obj3 = new Mago("Hagrid ", 45, 'M', " tasso frasso ");

      obj1.scontro(obj2);
      obj2.scontro(obj1);
      obj2.scontro(obj3);

      obj3.setDifesa(9.2); //incremento hagrid
      obj2.scontro(obj3);
   }
}
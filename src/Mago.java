public class Mago extends Personaggio {
   public Mago(String nome, int eta, char sesso, double attacco, double difesa, String casata) {
      super(nome, eta, sesso, attacco, difesa, casata);
   }

   public Mago(String nome, int eta, char sesso, String casata) {
      super(nome, eta, sesso, casata);
   }

   @Override
   public void scontro (Personaggio avversario){
      System.out.println(this.getNome() + " ha sfidato a duello " + avversario.getNome());
      if (this.getAttacco() > avversario.getDifesa()) {
         System.out.println(this.getNome() + " ha vinto! ");
         System.out.println("cento punti alla casata " + this.getCasata());
      }
      else{
         System.out.println(avversario.getNome() + " si è difeso ");
         if (avversario.getAttacco() > this.getDifesa()) {
            System.out.println(avversario.getNome() + " ha vinto ");
            System.out.println("cento punti alla casata " + avversario.getCasata());
         }
         else {
            System.out.println(this.getNome() + " e " + avversario.getNome() + " si stringono la mano " );
            System.out.println(" 50 punti alla casata perbacco  " + this.getCasata());
            System.out.println(" 50 punti alla casata perbacco  " + avversario.getCasata());
         }
      }


   }

}

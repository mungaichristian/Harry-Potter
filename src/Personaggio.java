public abstract class Personaggio {
  private  String nome;
  private  int eta;
  private char sesso;
  private double attacco;
  private double difesa;
  private String casata;
// costruttore
   public Personaggio(String nome, int eta, char sesso, double attacco, double difesa, String casata) {
      this.nome = nome;
      this.eta = eta;
      this.sesso = sesso;
      this.attacco = attacco;
      this.difesa = difesa;
      this.casata = casata;
   }

   public Personaggio(String nome, int eta, char sesso, String casata) {
      this.nome = nome;
      this.eta = eta;
      this.sesso = sesso;
      this.casata = casata;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setEta(int eta) {
      this.eta = eta;
   }
   public void setSesso(char sesso) {
      this.sesso = sesso;
   }
   public void setAttacco(double attacco) {
      this.attacco = attacco;
   }
   public void setDifesa(double difesa) {
      this.difesa = difesa;
   }
   public void setCasata(String casata) {
      this.casata = casata;
   }

   public abstract void scontro (Personaggio avversario);

   public String getNome() {
      return nome;
   }
   public int getEta() {
      return eta;
   }
   public char getSesso() {
      return sesso;
   }
   public double getAttacco() {
      return attacco;
   }
   public double getDifesa() {
      return difesa;
   }
   public String getCasata() {
      return casata;
   }
}

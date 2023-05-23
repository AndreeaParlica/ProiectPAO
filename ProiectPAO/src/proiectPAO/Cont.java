package proiectPAO;

//clasa abstracta
public abstract class Cont implements IRataDobanda {
    // listeaza proprietati comune ale celor doua conturi
    private String nume;
    private String cnp;
    private double sold;
    static int index = 10000; //numar unic pentru ca e static
    protected String numarCont;
    protected double rataDobanda;

    //constructor ce seteaza proprietati de baza si initializeaza contul
    public Cont(String nume, String cnp,double soldInitial){
        this.nume = nume;
        this.cnp = cnp;
        this.sold = soldInitial;
        index++;
        this.numarCont = generareNrCont();

        setareDobanda();
    }

    public abstract void setareDobanda();

    //methoda de creare a numarului de cont format 1 (cond curent) sau 2(cont economii) + ultimele doua cifre de la cnp + un numar unic format din 5
    // cifre + 3 cifre random
    private String generareNrCont(){
        String ultimele2Cnp = cnp.substring(cnp.length()-2, cnp.length());
        int contId = index;
        int numarRandom = (int) (Math.random() * Math.pow(10,3));
        return ultimele2Cnp + contId + numarRandom;
    }
    //List methode comune
    public void dobandaCompusa(){
        double rata = sold * (rataDobanda/100);
        sold = sold + rata;
        System.out.println("Rata compusa:  "+ rata);
        afiseazaSold();
    }
   public void depunere(double suma){
        sold = sold + suma;
       System.out.println("Se depune suma "+ suma);
       afiseazaSold();

   }

  public void retragere(double suma){
        try {
            if (sold > suma) {
                sold = sold - suma;
                System.out.println("Se retrage suma " + suma);
            }
        } catch (Exception e){
            System.out.println("Soldul mai mic decat suma");
            }
            afiseazaSold();
  }

  public void transfer(String cine, double suma){
        sold = sold - suma;
        System.out.println("Se transfera "+ suma + " catre " + cine);
        afiseazaSold();
  }

  public void afiseazaSold(){
        System.out.println("Soldul curent este "+ sold);}

    public void afiseazaInfo(){
        System.out.println(
                "Nume:" + nume+
                "\nNumar cont: " + numarCont+
                "\nSold: " + sold +
                "\nDobanda: "+ rataDobanda+"%"
        );
    }

}

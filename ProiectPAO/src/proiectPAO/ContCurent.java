package proiectPAO;

public class ContCurent extends Cont {
    //listeaza proprietati specifice ale contului curent
    private int contdebitNumar;
    private int contdebitPin;
    //constructor pentru initialiazare proprietatilor contului curent
    public ContCurent(String name, String cnp,double sold) {
        super(name, cnp, sold);
        numarCont = "2"+numarCont;
        seteazaContDeDebit();
    }

    // listeaza toate metodele specifice contului curent
    private void seteazaContDeDebit() {
        contdebitNumar = (int) (Math.random() * Math.pow(10,12));
        contdebitPin = (int) (Math.random() * Math.pow(10,4));

    }
    @Override
    public void setareDobanda(){
        rataDobanda = dobadaDeBaza() * .15;
    }
    public void afiseazaInfo(){
        System.out.println("Tip cont: Cont Curent");
        super.afiseazaInfo();
        System.out.println("Contul este asociat unui cont de debit ->"+
                "\n Numar cont de debit: "+ contdebitNumar +
                "\n PIN cont de debit: " + contdebitPin);
    }
}

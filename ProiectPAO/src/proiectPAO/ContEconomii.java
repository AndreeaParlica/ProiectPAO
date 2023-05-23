package proiectPAO;

public class ContEconomii extends Cont {
    // listeaza proprietati specifice contului de economii
    private int idCutieValori;
    private int pinCutieValori;
    // constructor pentru initializarea prorpietatilor contului de ec
    public ContEconomii(String name, String cnp, double sold){
        super(name, cnp, sold);
        numarCont = "1"+numarCont;
        seteazaCutieDeValori();
    }
    //methode specifice contului de ec
    private void seteazaCutieDeValori(){
        idCutieValori =(int) (Math.random() * Math.pow(10,3));
        pinCutieValori = (int) (Math.random() * Math.pow(10,4));
    }
    @Override
    public void setareDobanda(){
        rataDobanda = dobadaDeBaza() - .25;
    }

    public void afiseazaInfo(){
        System.out.println("Tip cont: Cont de Economii");
        super.afiseazaInfo();
        System.out.println("Cutie de valoari alocata ->"+
                "\n ID cutie de valori: " + idCutieValori +
                "\n PIN cutie de valori: " + pinCutieValori);

    }
}

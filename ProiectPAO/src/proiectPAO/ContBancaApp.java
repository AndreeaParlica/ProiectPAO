package proiectPAO;

import java.util.LinkedList;
import java.util.List;

public class ContBancaApp {
    public static void main(String[] args) {

        List<Cont> conturi = new LinkedList<Cont>();


        //se citeste un csv file
        String csvFilePath = "/Users/andreeap/Downloads/PAO-PROIECT/src/proiectPAO/NewBankAccounts.csv";
        List<String[]> clientiNoi = utils.CSV.readCsv(csvFilePath);
        for (String[]  clientNou : clientiNoi) {
            String nume = clientNou[0];
            String cnp = clientNou[1];
            String tipCont = clientNou[2];
            double soldInitial = Double.parseDouble(clientNou[3]);
            System.out.println(nume + " "+ cnp +" "+ tipCont +" "+ soldInitial);
            if (tipCont.equals("Savings")) {
                conturi.add(new ContEconomii(nume, cnp,soldInitial));
            } else if(tipCont.equals("Checking")) {
                conturi.add(new ContCurent(nume, cnp, soldInitial));
            } else {
                System.out.println("Eroare citire tip cont");
            }
        }
        for (Cont acc : conturi){
            System.out.println("************************");
            acc.afiseazaInfo();
        }
        //se depune suma 200 in conturi in mod aleatoriu
        conturi.get((int)Math.random() * conturi.size()).depunere(200);

        //se depune suma de 100 lei in conturile pe pozitii pare in lista de obiecte si se retarge 80 lei
        //din conturile care se afla pe pozitii impare in lista
        int index = 0;
        for (Cont acc : conturi){
            if (index % 2 != 0) {
                System.out.println("---------------------------");
                System.out.println("Ce noroc!!!Se depune suma de 100 lei in conturile pe pozitiile pare din lista de conturi");
                conturi.get(index).depunere(100);
            } else {
                System.out.println("---------------------------");
                System.out.println("Ce ghinion!!!Se retrage suma de 150 lei in conturile pe pozitiile impare din lista de conturi");
                conturi.get(index).retragere(150);
            }
            index += 1;
        }
    }
}

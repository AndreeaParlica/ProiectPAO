package proiectPAO;

public interface IRataDobanda { //se va folosi o sursa externa, cu metode de extragere folosind API
    // o methode ce returneaza dobanda
    default double dobadaDeBaza() {
        return 2.5;
    }

}

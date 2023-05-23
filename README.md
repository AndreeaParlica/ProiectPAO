# ProiectPAO
Aplicatie pentru o banca ce permite crearea de conturi noi folosind un fișier de tip .csv

Cerinte indeplinite:
##Citest un fisier .csv
##Folosetse structura de date potrivită pentru a stoca toate informațiile: lista de obiecte
##Exista o clasa abstractă
##Exista o methoda abstracta
##Foloseste moștenire
##Methode implementate 
depozitare()
retragere()
transfer()
afiseazaInfo() - afișează

##Cerinte proiect:
##Numarul contului va fi compus din:
###Cifra “2” dacă este cont curent sau cifra “1” dacă este cond de economii
###Plus Ultimele 2 cifre de la CNP+ un număr unic format din 5 cifre + 3 cifre aleatorii
###Clienții care au cont de economii vor avea și o cutie de valori care va avea un număr unic de identificare format din 3 cifre și un pin de acces format din 4 cifre
###Clienții cu cont curent vor avea un card de debit identificat cu 12 cifre și un pin de 4 cifre

##Ambele conturi vor folosi o interfața pentru determinarea dobânzii
###Pentru conturile de economii se va folosi 0.25
###Pentru conturile curente se va folosi 0.15

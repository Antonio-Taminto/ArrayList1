//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)

//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con n elementi e stamparlo in console.
//        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Mario Rossi",25);
        Student studente2 = new Student("Mario Verdi",78);
        Student studente3 = new Student("Mario Bianchi",40);
        Student studente4 = new Student("Mario Mario",12);


        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);

        for(Student studente : studenti){
            System.out.println("Nome: " + studente.getName() + ", eta: " + studente.getAge());
        }
    }
}
package teste.vetores;

import vetores.Vetor;

public class aula07 {
    public static void main(String[] args) {
        Vetor vetor=new Vetor(10);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("Troquei B",1);
        System.out.println(vetor);
    }
}

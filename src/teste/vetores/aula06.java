package teste.vetores;

import vetores.Vetor;

public class aula06 {
    public static void main(String[] args) {
        Vetor vetor=new Vetor(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println(vetor.buscar("Elemento 3"));
    }
}

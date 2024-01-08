package teste.vetores;

import vetores.Vetor;

public class aula09 {
    public static void main(String[] args) {
        Vetor vetor=new Vetor(10);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        System.out.println(vetor);
        vetor.removeelemento(1);
        System.out.println(vetor);
        int pos=vetor.buscar("D");
        if(pos>-1){
            vetor.removeelemento(pos);
        }
        else{
            System.out.println("Esse elemento não existe");
        }
        System.out.println(vetor);

    }
}

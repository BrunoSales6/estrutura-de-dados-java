package teste.vetores;

import vetores.VetorGenerico;

public class teste {
    public static void main(String[] args) {
        VetorGenerico vetor=new VetorGenerico<>(5);
        vetor.adiciona(1);
        vetor.adiciona(3);
        vetor.adiciona(3);
        System.out.println(vetor.ultimoindex(1));
        vetor.removeelemneto(3);
        System.out.println(vetor);
        vetor.limpar();
        System.out.println(vetor);

    }
}

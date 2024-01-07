package vetores;

import java.util.Arrays;

public class Vetor {
        private String [] elementos;
        private int tamanho=0;
        public Vetor(int capacidade){
            this.elementos=new String[capacidade];
        }
        /*public void adiciona(String elemento){
            for(int c=0;c<this.elementos.length;c++){
                if (this.elementos[c]==null){
                    this.elementos[c]=elemento;
                    break;
                }
            }
        }*/
        public void adiciona(String elemento){
            if(this.tamanho<this.elementos.length){
                elementos[tamanho]=elemento;
                tamanho++;
            }
            else{
                System.out.println("Vetor cheio");
            }
        }
        public int tamanho(){
            return this.tamanho;
        }

        public String busca(int posicao){
            if(!(posicao>=0 && posicao<this.tamanho)){
                throw new IllegalArgumentException("Posição inválida");
            }
            return this.elementos[posicao];
        }

        public String toString(){
            StringBuilder st=new StringBuilder();
            st.append("[");
            for(int c=0;c<tamanho-1;c++){
                st.append(this.elementos[c]);
                st.append(", ");
            }

            return Arrays.toString(elementos);

        }

        public int buscar(String valor){
            for(int c=0;c<tamanho;c++){
                if(this.elementos[c].equals(valor)){
                    return c;
                }
            }
            return -1;
        }


}






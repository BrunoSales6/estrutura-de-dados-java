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

        public String toString(){
            StringBuilder s=new StringBuilder();
            s.append("[");
            for(int c=0;c<tamanho-1;c++){
                s.append(this.elementos[c]);
                s.append(", ");
            }

            return Arrays.toString(elementos);

        }


}





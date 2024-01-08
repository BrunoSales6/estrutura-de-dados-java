package vetores;

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
            this.aumentaCapacidade();
            if(this.tamanho<this.elementos.length){
                elementos[tamanho]=elemento;
                tamanho++;
            }
            else{
                System.out.println("Vetor cheio");
            }
        }
        public boolean adiciona(String elemento ,int posicao){
            if(!(posicao>=0 && posicao<this.tamanho)){
                throw new IllegalArgumentException("Posição inválida");
            }
            this.aumentaCapacidade();
            for(int c=tamanho-1;c>=posicao;c--){
                this.elementos[c+1]=this.elementos[c];
            }
            this.elementos[posicao]=elemento;
            this.tamanho++;
            return true;
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
            if(this.tamanho>0){
                st.append(this.elementos[this.tamanho-1]);
            }

            st.append("]");

            return st.toString();

        }

        public int buscar(String valor){
            for(int c=0;c<tamanho;c++){
                if(this.elementos[c].equals(valor)){
                    return c;
                }
            }
            return -1;
        }

        private void aumentaCapacidade(){
            if(this.tamanho==this.elementos.length){
                String [] elementosnovos=new String[this.elementos.length*2];
                for(int c=0;c<this.tamanho;c++){
                    elementosnovos[c]=elementos[c];
                }
                this.elementos=elementosnovos;
            }
        }

        public void removeelemento(int posicao){
            if(!(posicao>=0 && posicao<this.tamanho)){
                throw new IllegalArgumentException("Posição inválida");
            }
            for(int c=posicao;c<tamanho;c++){
                this.elementos[c]=this.elementos[c+1];
            }
            this.tamanho--;
        }


}






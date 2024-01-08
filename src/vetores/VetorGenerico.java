package vetores;

public class VetorGenerico<T> {
    private T [] elementos;
    private int tamanho=0;
    public VetorGenerico(int capacidade){
        this.elementos=(T[])new Object[capacidade];
    }

    public void adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho<this.elementos.length){
            elementos[tamanho]=elemento;
            tamanho++;
        }
        else{
            System.out.println("Vetor cheio");
        }
    }
    public boolean adiciona(T elemento ,int posicao){
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

    public T obtem(int posicao){
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

    public int buscar(T valor){
        for(int c=0;c<tamanho;c++){
            if(this.elementos[c].equals(valor)){
                return c;
            }
        }
        return -1;
    }

    private void aumentaCapacidade(){
        if(this.tamanho==this.elementos.length){
            T [] elementosnovos= (T[]) new Object[this.elementos.length*2];
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
    public void removeelemneto(T elemento){
       int pos=buscar(elemento);
       if(pos>-1){
           this.removeelemento(pos);
       }
    }

    public boolean contem(T elemento){
        return buscar(elemento)>-1;
    }

    public int ultimoindex(T elemento){
        int pos=-1;
        for(int c=0;c<this.tamanho;c++){
            if(elementos[c].equals(elemento)){
                pos=c;
            }
        }
        return pos;
    }

    public void limpar(){
        for(int c=0;c<this.tamanho;c++){
            elementos[c]=null;
        }
        this.tamanho=0;
    }
}

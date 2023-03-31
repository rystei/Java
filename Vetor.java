package Vetor;

public class Vetor {
    private int[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean vazio() {
        /*if (this.tamanho == 0) {
            return true;
        } else {
            return false;
        }*/
        return this.tamanho == 0;
    }

    public boolean cheio() {
        return this.tamanho == this.capacidade;
    }

    public int buscaElemento(int indice){
        if (indice < 0 || indice > this.capacidade) {
            System.out.println("Indice inexistente. Tente novamente");
            return -1111;
        } else {
            return this.elementos[indice];
        }

    }

    public void insere(int elemento) {
        if (this.cheio()) {
            //System.out.println("Não é possível inserir elementos no Vetor, pois ele está cheio!");
            this.aumentarCapacidade();
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public void remove(int indice) {
        if (indice < 0 || indice > this.capacidade) {
            System.out.println("Indice inexistente. Tente novamente");
        } else {
            for (int i = indice; i < this.capacidade - 1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
        }
        this.tamanho--;
    }

    public void mostraElementos() {
        for (int i = 0; i < this.capacidade; i++) {
            System.out.println("Vetor[" + i + "] = " + this.elementos[i]);
        }
    }

    private void aumentarCapacidade() {
        this.capacidade = this.capacidade*2;
        int [] vetorNovo = new int[this.capacidade];
        for (int i = 0; i < this.tamanho; i++) {
            vetorNovo[i] = this.elementos[i];
        }
        this.elementos = vetorNovo;
    }
}
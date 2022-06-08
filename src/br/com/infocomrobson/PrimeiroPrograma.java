package br.com.infocomrobson;

import br.com.infocomrobson.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Emma", "Malhada", 2);
        System.out.println(gato);
        Livro livro = new Livro("COdes...", 300);
        System.out.println(livro);
        /*int a = 5;
        int b = 13;
        System.out.println("Hello world! "+(a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPag;

    public Livro() {
    }

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}
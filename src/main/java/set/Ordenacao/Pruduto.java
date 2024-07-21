package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Pruduto implements Comparable<Pruduto> {

    //atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Pruduto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Pruduto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pruduto pruduto)) return false;
        return codigo == pruduto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Pruduto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Pruduto>{

    @Override
    public int compare(Pruduto p1, Pruduto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
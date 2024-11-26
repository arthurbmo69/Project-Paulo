package model;

import java.util.Date;
import java.util.List;

public class Vendas {
    private int id;
    private Date data;
    private List<Produto> listaProdutos;
    private double valorTotal;

    // Construtor
    public Vendas(int id, Date data, List<Produto> listaProdutos, double valorTotal) {
        this.id = id;
        this.data = data;
        this.listaProdutos = listaProdutos;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Vendas [id=" + id + ", data=" + data + ", listaProdutos=" + listaProdutos + ", valorTotal=" + valorTotal + "]";
    }
}
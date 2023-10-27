package model;

public class Pedido {
    private int numero;
    private String data;
    private Double valor;
    //associação binária um vendedor pode ter 0 ou muitos pedidos e um pedido pode ter somente 1 vendedor//
    Vendedor vendedor;
    Tipo tipo;
    Item item;

    public Pedido() {
    }

    public Pedido(int numero, String data, Double valor, Vendedor vendedor, Tipo tipo, Item item) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.tipo = tipo;
        this.item = item;
    }

    public Pedido(int i, String s, double v, Funcionario funcionario2) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", tipo=" + tipo +
                ", item=" + item +
                '}';
    }
}

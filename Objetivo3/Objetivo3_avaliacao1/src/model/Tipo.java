package model;

public class Tipo {
    private int numero;
    private String marca;
    Pedido pedido;

    public Tipo() {
    }

    public Tipo(int numero, String marca, Pedido pedido) {
        this.numero = numero;
        this.marca = marca;
        this.pedido = pedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "\nTipo{" +
                "numero=" + numero +
                ", marca='" + marca + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}

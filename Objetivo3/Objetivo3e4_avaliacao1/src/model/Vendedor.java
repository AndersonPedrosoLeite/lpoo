package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private String local;
    private List<Pedido> pedidosList = new ArrayList<>();

    public Vendedor(String local) {
        super();
        this.local = local;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public Vendedor(String local, List<Pedido> pedidosList) {
        this.local = local;
        this.pedidosList = pedidosList;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local, List<Pedido> pedidosList) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
        this.pedidosList = pedidosList;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "local='" + local + '\'' +
                ", matricula=" + getMatricula() +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                '}';
    }
}

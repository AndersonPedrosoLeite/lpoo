package model;

public class Locacao {
    private String dataLocacao;
    private String horaLocacao;
    private String dataDevolucao;
    private String horaDevolucao;
    private Integer quilometragem;
    private Double valorCalcao;
    private Double valor_locacao;
    private Boolean devolvido;

    public Locacao() {
    }

    public Locacao(String dataLocacao, String horaLocacao, String dataDevolucao, String horaDevolucao, Integer quilometragem, Double valorCalcao, Double valor_locacao, Boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "dataLocacao='" + dataLocacao + '\'' +
                ", horaLocacao='" + horaLocacao + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", horaDevolucao='" + horaDevolucao + '\'' +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}

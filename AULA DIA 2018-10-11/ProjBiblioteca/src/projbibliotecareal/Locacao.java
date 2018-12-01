package projbibliotecareal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Funcionario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Data dataLocacao;
    private Data dataDevolucao;

    public Locacao() {
        this.funcionario = new Funcionario();
        this.usuario = new Usuario();
        this.livro = new Livro();
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularLocacao() throws ParseException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/mm/yyyy");
        Date dataL = formataData.parse(this.dataLocacao.toString());
        Date dataD = formataData.parse(this.dataDevolucao.toString());
        long dias = (dataD.getTime() - dataL.getTime()) / 86400000;
        
        if (dias <= 7) {
            return valorLocacao;
        }
        return (dias-7) * this.valorMulta + valorLocacao;
    }

    public void locarLivro() {
        this.livro.status = false;
        this.valorLocacao = 3;
    }

    public void devolverLivro() {
        this.livro.status = true;
    }

    @Override
    public String toString() {
        return "Dados da Locação: "
                + "\n\n"
                + "Valor da locação: " + valorLocacao + "\n"
                + "Valor da multa: " + valorMulta + "\n\n"
                + "Funcionário que está efetuando a locação: " + funcionario + "\n"
                + "Usuário: " + usuario + "\n"
                + "Livro: " + livro + "\n\n"
                + "Data da locação: " + dataLocacao + "\n"
                + "Data da devolução: " + dataDevolucao + "\n";
    }

}

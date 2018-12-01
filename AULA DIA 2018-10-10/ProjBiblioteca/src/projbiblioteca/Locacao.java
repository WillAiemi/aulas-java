package projbiblioteca;
public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Funcionario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Data dataLocacao;
    private Data dataDevolucao;
    
    public Locacao(){
        this.funcionario = new Funcionario();
        this.usuario = new Usuario();
        this.livro = new Livro();
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
        livro.status = true;
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

    public double calcularLocacao(){
        return this.valorLocacao + this.valorMulta;
    }
    
    public void locarLivro(){
        livro.status = false;
    }
    public void devolverLivro(){
        livro.status = true;
    }

    @Override
    public String toString() {
        return "\n"
                + "Valor da locação: " + valorLocacao + "\n"
                + "Valor da multa: " + valorMulta + "\n"
                + "FUNCIONÁRIO" + funcionario + "\n"
                + "USUÁRIO" + usuario + "\n"
                + "LIVRO" + livro + "\n"
                + "Data da locação: " + dataLocacao + "\n"
                + "Data da devolucao: " + dataDevolucao + "\n";
    }
    
    
}

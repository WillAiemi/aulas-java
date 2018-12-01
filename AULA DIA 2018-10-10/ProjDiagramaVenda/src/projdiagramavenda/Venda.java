package projdiagramavenda;
public class Venda {
    private int codigo;
    private Livro livro1;
    private Livro livro2;
    private Data dataVenda;
    
    public Venda(){
        this.livro1 = new Livro();
        this.livro2 = new Livro();
        this.dataVenda = new Data();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Livro getLivro1() {
        return livro1;
    }

    public void setLivro1(Livro livro1) {
        this.livro1 = livro1;
    }

    public Livro getLivro2() {
        return livro2;
    }

    public void setLivro2(Livro livro2) {
        this.livro2 = livro2;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public double calcularVenda(){
        return this.livro1.getValor() + this.livro2.getValor();
    }

    @Override
    public String toString() {
        return "\n"
                + "Codigo: " + codigo + "\n"
                + "Livro 1: " + livro1 + "\n"
                + "Livro 2: " + livro2 + "\n"
                + "Data da venda: " + dataVenda + "\n"
                + "Total: " + calcularVenda() + "\n";
    }
    
    
}

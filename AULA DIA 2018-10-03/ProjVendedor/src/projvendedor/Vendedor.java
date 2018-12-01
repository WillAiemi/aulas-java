package projvendedor;

public class Vendedor{
    private String nome;
    private float valorTotalVendido;
    private float meta;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setValorTotalVendido(float valorTotalVendido){
        this.valorTotalVendido = valorTotalVendido;
    }
    public float getValorTotalVendido(){
        return this.valorTotalVendido;
    }
    public void setMeta(float meta){
        this.meta = meta;
    }
    public float getMeta(){
        return this.meta;
    }
    public float calcularComissao(){
        float comissao = this.valorTotalVendido/this.meta;
        if (comissao <= 0.5) {
            return this.valorTotalVendido * 0.01f;
        } else if (comissao <= 0.75) {
            return this.valorTotalVendido * 0.025f;
        } else if (comissao <= 1) {
            return this.valorTotalVendido * 0.035f;
        } else {
            return this.valorTotalVendido * 0.05f;
        }
    }
    public String toString(){
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Valor total vendido: " + this.valorTotalVendido + "\n"
                + "Meta: " + this.meta + "\n"
                + "Comissão: " + this.calcularComissao() + "\n";
    }
}

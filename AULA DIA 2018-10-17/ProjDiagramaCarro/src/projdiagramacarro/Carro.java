package projdiagramacarro;
public class Carro {
    private String marca;
    private int ano;
    private String placa;
    private double valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String espacosToString(String z, int x){
        int espacos = 52-x-z.length();
        String r = "";
        for (int i = 0; i < espacos; i++) {
            r += " ";
        }
        r += "::";
        return r;
    }

    @Override
    public String toString() {
        return "\n"
                + ":: MARCA: " + marca + espacosToString(marca, 5) + "\n"
                + ":: ANO: " + ano + espacosToString(Integer.toString(this.ano), 3) + "\n"
                + ":: PLACA: " + placa + espacosToString(placa, 5) + "\n"
                + ":: VALOR: R$" + valor + espacosToString(Double.toString(valor), 7) +"\n";
    }
    
    
}

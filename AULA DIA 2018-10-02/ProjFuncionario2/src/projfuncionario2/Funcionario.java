package projfuncionario2;

public class Funcionario {

    private String nome;
    private int chapa;
    private double valorHora;
    private double cargaHorariaTrabalhada;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public int getChapa() {
        return this.chapa;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setCargaHorariaTrabalhada(double cargaHorariaTrabalhada) {
        this.cargaHorariaTrabalhada = cargaHorariaTrabalhada;
    }

    public double getCargaHorariaTrabalha() {
        return this.cargaHorariaTrabalhada;
    }

    public double calcularSalario() {
        return this.valorHora * this.cargaHorariaTrabalhada;
    }

    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Chapa: " + this.chapa + "\n"
                + "Valor hora: " + this.valorHora + "\n"
                + "Carga horária trabalhada: " + this.cargaHorariaTrabalhada + "\n"
                + "Salário: R$" + calcularSalario() + "\n";
    }
}

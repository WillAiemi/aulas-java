package projcarro;

public class Carro {

    public String marca;
    public String modelo;
    public int anoFabricacao;
    public int anoModelo;
    public double autonomia;
    public double nivelTanque;
    public double valorLitroCombustivel;

    public double distanciaAPercorrer() {
        return nivelTanque * autonomia;
    }

    public double gastoNoPercurso() {
        return nivelTanque * valorLitroCombustivel;
    }

    public String mostrarTudo() {
        return "\n\nDados do carro"
                + "\nMarca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nAno de fabricação: " + this.anoFabricacao
                + "\nAno do modelo: " + this.anoModelo
                + "\nAutonomia: R$" + this.autonomia
                + "\nNível do tanque: " + this.nivelTanque
                + "\nValor por litro de combustível: R$" + this.valorLitroCombustivel
                + "\nDistância a percorrer: " + this.distanciaAPercorrer()
                + "\nValor gasto no percurso: R$" + this.gastoNoPercurso();
    }

}

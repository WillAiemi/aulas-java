package projcarro;

public class Carro {
    public String marca;
    public String modelo;
    public String chassi;
    public int anoFabricacao;
    public int anoModelo;
    public double valorUnitario;
    public int quantidade;
    public double nivelTanque;
    public double mediaKmLitro;
    
    public double calcularValorTotalDoVeiculo(){
        return valorUnitario * quantidade;
    }
    public double calcularDistanciaAPercorrer(){
        return nivelTanque * mediaKmLitro;
    }
}

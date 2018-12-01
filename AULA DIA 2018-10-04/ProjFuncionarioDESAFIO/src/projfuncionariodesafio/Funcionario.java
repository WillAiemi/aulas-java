package projfuncionariodesafio;

public class Funcionario {

    private String nome;
    private int chapa;
    private long cpf;
    private String rg;
    private String endereco;
    private String fone;
    private String sexo;
    private String email;
    private String cargo;
    private byte quatidadeDeDependentes;
    private byte quantidadeDeFilhos;
    private byte tempoDeServicoAno;
    private double valorHora;
    private double cargaHorariaBase;
    private double quantidadeDeHorasExtras;
    private boolean opcaoVT;
    private double valorPagoEmPassagens;
    private byte grauInsalubridade;

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

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return this.rg;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return this.fone;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setQuantidadeDeDependentes(byte quantidadeDeDependentes) {
        this.quatidadeDeDependentes = quantidadeDeDependentes;
    }

    public byte getQuantidadeDeDependentes() {
        return this.quatidadeDeDependentes;
    }

    public void setQuantidadeDeFilhos(byte quantidadeDeFilhos) {
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public byte getQuantidadeDeFilhos() {
        return this.quantidadeDeFilhos;
    }

    public void setTempoDeServicoAno(byte tempoDeServicoAno) {
        this.tempoDeServicoAno = tempoDeServicoAno;
    }

    public byte getTempoDeServicoAno() {
        return this.tempoDeServicoAno;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setCargaHorariaBase(double cargaHorariaBase) {
        this.cargaHorariaBase = cargaHorariaBase;
    }

    public double getCargaHorariaBase() {
        return this.cargaHorariaBase;
    }

    public void setQuantidadeDeHorasExtras(double quantidadeDeHorasExtras) {
        this.quantidadeDeHorasExtras = quantidadeDeHorasExtras;
    }

    public double getQuantidadeDeHorasExtras() {
        return this.quantidadeDeHorasExtras;
    }

    public void setValorPagoEmPassagens(double valorPagoEmPassagens) {
        this.valorPagoEmPassagens = valorPagoEmPassagens;
    }

    public double getValorPagoEmPassagens() {
        return this.valorPagoEmPassagens;
    }

    public void setGrauInsalubridade(byte grauInsalubridade) {
        this.grauInsalubridade = grauInsalubridade;
    }

    public byte getGrauInsalubridade() {
        return this.grauInsalubridade;
    }

    public void receberVT() {
        this.opcaoVT = true;
    }

    public void cancelarVT() {
        this.opcaoVT = false;
        this.valorPagoEmPassagens = 0;
    }

    public String mostrarLegendaVT() {
        if (this.opcaoVT) {
            return "Sim, ganha VT";
        }
        return "Não, não ganha VT";
    }

    public double calcularSalarioBruto() {
        return this.valorHora * this.cargaHorariaBase;
    }

    public double calcularVT() {
        if (this.opcaoVT) {
            if(0.06 * this.calcularSalarioBruto() > this.valorPagoEmPassagens) {
                return this.valorPagoEmPassagens;
            }
            return 0.06 * this.calcularSalarioBruto();
        }
        return 0;
    }

    public double calcularHoraExtra() {
        double horasExtraMenosDois = this.quantidadeDeHorasExtras - 2;
        if(horasExtraMenosDois < 0) {
            horasExtraMenosDois = 0;
        }
        return this.quantidadeDeHorasExtras * this.valorHora * 0.5 + horasExtraMenosDois * this.valorHora * 0.5;
    }

    public double calcularInss() {
        double sBruto = this.calcularSalarioBruto();
        if (sBruto <= 1659.38) {
            return sBruto * 0.08;
        } else if (sBruto <= 2765.66) {
            return sBruto * 0.09;
        } else if (sBruto <= 5531.31) {
            return sBruto * 0.11;
        } else {
            return 5531.31 * 0.11;
        }
    }
    
    public double calcularInsalubridade(){
        switch (this.grauInsalubridade) {
            case 1:
                return 1030.06 * 0.4;
            case 2:
                return 1030.06 * 0.2;
            case 3:
                return 1030.06 * 0.1;
            default:
                return 0;
        }
    }

    public double calcularSalarioFamilia() {
        if (this.quantidadeDeFilhos <= 0) {
            return 0;
        } else if (this.quantidadeDeFilhos == 1) {
            return this.calcularSalarioBruto() * 0.02;
        } else if (this.quantidadeDeFilhos <= 3) {
            return this.calcularSalarioBruto() * 0.04;
        } else {
            return this.calcularSalarioBruto() * 0.05;
        }
    }

    public double calcularPlanoDeSaude() {
        return (0.005 + this.quatidadeDeDependentes * 0.01) * this.calcularSalarioBruto();
    }

    public double planoDeCarreira() {
        int carreira = this.tempoDeServicoAno / 3;
        return this.calcularSalarioBruto() * carreira * 0.05;
    }

    public double calcularSalarioLiquido() {
        return this.calcularSalarioBruto() + this.calcularInsalubridade() + this.calcularHoraExtra() + this.calcularSalarioFamilia() - this.calcularInss() - this.calcularVT() - this.calcularPlanoDeSaude();
    }

    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\nChapa: " + this.chapa + "\n"
                + "CPF: " + this.cpf + "\n"
                + "RG: " + this.rg + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "Fone: " + this.fone + "\n"
                + "Sexo: " + this.sexo + "\nEmail: " + this.email + "\n"
                + "Cargo: " + this.cargo + "\n"
                + "Quantidade de dependentes: " + this.quatidadeDeDependentes + "\n"
                + "Quantidade de filhos: " + this.quantidadeDeFilhos + "\n"
                + "Tempo de serviço em anos: " + this.tempoDeServicoAno + "\n"
                + "Valor hora: R$" + this.valorHora + "\n"
                + "Carga horária base: " + this.cargaHorariaBase + "\n"
                + "Quantidade de horas extras: " + this.quantidadeDeHorasExtras + "\n"
                + "Ganha VT: " + this.mostrarLegendaVT() + "\n"
                + "Valor pago em passagens: R$" + this.valorPagoEmPassagens + "\n"
                + "Grau de insalubridade: " + this.grauInsalubridade + "\n"
                + "Salário bruto: R$" + this.calcularSalarioBruto() + "\n"
                + "Valor do vale-transporte: R$" + this.calcularVT() + "\n"
                + "Valor das horas extras: R$" + this.calcularHoraExtra() + "\n"
                + "Valor do INSS: R$" + this.calcularInss() + "\n"
                + "Valor da insalubridade: R$" + this.calcularInsalubridade() + "\n"
                + "Salário família: R$" + this.calcularSalarioFamilia() + "\n"
                + "Valor do plano de saúde: R$" + this.calcularPlanoDeSaude() + "\n"
                + "Plano de carreira: R$" + this.planoDeCarreira() + "\n"
                + "Salário líquido: R$" + this.calcularSalarioLiquido() + "\n";
    }
}

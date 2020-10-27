package exercicio2;

import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;

    public Funcionario(int idFunc, String nomeFunc, String departamento, LocalDate dataContratacao, double salario, String documento, boolean estaAtivo) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.documento = documento;
        this.estaAtivo = estaAtivo;
    }

    public Funcionario() {
    }

    public void atualizarSalario(double salario){
        this.salario = this.salario + salario;
    }

    public void demitirFuncionario(){
        estaAtivo = false;
    }

    public void imprimir() {
        System.out.println("Funcionario{" +
                "idFunc=" + idFunc +
                ", nomeFunc='" + nomeFunc + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + salario +
                ", documento='" + documento + '\'' +
                ", estaAtivo=" + estaAtivo +
                '}');
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
}

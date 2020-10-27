package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Funcionario[] empregados;

    public void adicionarEmpregados(Funcionario func, int indice){
        if(!(empregados.length >= 20)){
            empregados[indice] = func;
        } else {
            System.out.println("====Número limite de empregados atingido====");
        }
    }

    public void mostrarEmpregados(){
        System.out.println("====DADOS DOS FUNCIONARIOS====");
        for (Funcionario empregado : empregados) {
            empregado.imprimir();
        }
    }

    public boolean contemEmpregado(Funcionario func){
        for (Funcionario empregado : empregados) {
            if(empregado.getIdFunc() == func.getIdFunc()){
                return true;
            }
        }

        return false;
    }


    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }
}

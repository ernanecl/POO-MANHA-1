package exercicio2;

import java.time.LocalDate;
import java.util.Date;

public class GerenciarFuncionario {
    public int posicao = 0;
    final static int TAM = 3;
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        Funcionario func = new Funcionario(
                1,
                "joao",
                "Desenvolvimento",
                localDate,
                8000.00,
                "RG",
                true
        );

        func.atualizarSalario(100.00);
        func.imprimir();
        func.demitirFuncionario();
        func.imprimir();



        Funcionario func1 = new Funcionario(
                1,
                "joao",
                "Desenvolvimento",
                localDate,
                8000.00,
                "RG",
                true
        );

        Funcionario func2 = new Funcionario(
                1,
                "joao",
                "Desenvolvimento",
                localDate,
                8000.00,
                "RG",
                true
        );

        Funcionario func3 = new Funcionario(
                1,
                "joao",
                "Desenvolvimento",
                localDate,
                8000.00,
                "RG",
                true
        );

        Empresa emp = new Empresa();
        emp.setEmpregados(new Funcionario[TAM]);

        emp.adicionarEmpregados(func1,0);
        emp.adicionarEmpregados(func2,1);
        emp.adicionarEmpregados(func3,2);

        boolean contemEmpregado = emp.contemEmpregado(func1);
        if(contemEmpregado){
            System.out.println("Funcionário pertencente ao quadro da empresa");
        } else {
            System.out.println("Funcionário não pertence ao quadro da empresa");
        }


        /*Exercicio final SAÍDA - ENTRADA 1*/
        Integer x = new Integer(6) * 7;
        if (x != 42) {
            System.out.println("not 42");
        } else if (x.equals(42)) {
            System.out.println("entrada 1");
        } else {
            System.out.println("entrada 2");
        }

}
}

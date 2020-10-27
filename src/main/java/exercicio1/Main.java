package exercicio1;


public class Main {
    public static void main(String argumentos[]){

        /*
            Programa: 1
            Classe: Pessoa
            Atributos: nome, idade.
            Método: void fazAniversario()
            Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e
            imprima seu nome e sua idade.
         */
        Pessoa pessoa = new Pessoa("Fulano",23);
        System.out.println("Idade inicial");
        System.out.print(pessoa.toString());
        pessoa.fazAniversario();

        System.out.println("Fez aniversário!!!");
        System.out.print(pessoa.toString());
        pessoa.fazAniversario();

        System.out.println("Fez aniversário!!!");
        System.out.print(pessoa.toString());
        pessoa.fazAniversario();

        System.out.println("Fez aniversário!!!");
        System.out.print(pessoa.toString());
        pessoa.fazAniversario();

        System.out.println("Fez aniversário!!!");
        System.out.print(pessoa.toString());
        pessoa.fazAniversario();


        /*
            Programa: 2
            Classe: Janela
            Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ [Privados e implantar os métodos gets/sets].
            Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()
            Crie uma janela, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
            estaAberta para verificar se ela está aberta ou não.
         */

        Janela janela = new Janela(
                false,
                "cinza",
                "2000",
                "3000",
                "3000"
        );
        janela.abre();
        janela.fecha();
        janela.pinta("marrom");
        janela.pinta("cinza");
        janela.pinta("marrom-mamão");
        janela.setDimensaoX("3000");
        janela.setDimensaoY("4000");

        if(janela.estaAberta()){
            System.out.println("Está aberta!");
        } else {
            System.out.println("Está fechada!");
        }

        /*
            Programa: 3
            Classe: Casa
            Atributos: cor, janela1, janela2, janela3
            Métodos: void pinta(String s), int quantidadeJanelasAbertas()
            Crie uma casa e pinte-a. Crie três janelas e coloque-as na casa; abra e feche as mesmas como desejar.
            Utilize o método quantidadeJanelasAbertas para imprimir o número de janelas abertas
         */

        Casa casa = new Casa();
        casa.pinta("Amarelo");
        Janela janela1 = new Janela(
                false,
                "cinza",
                "2000",
                "3000",
                "3000"
        );

        Janela janela2 = new Janela(
                true,
                "cinza",
                "2000",
                "3000",
                "3000"
        );

        Janela janela3 = new Janela(
                true,
                "cinza",
                "2000",
                "3000",
                "3000"
        );

        casa.setJanela1(janela1);
        casa.setJanela2(janela2);
        casa.setJanela3(janela3);

        casa.quantidadeJanelasAbertas();

    }
}
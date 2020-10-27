package exercicio1;

public class Casa {
    private String cor;
    Janela janela1;
    Janela janela2;
    Janela janela3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela getJanela1() {
        return janela1;
    }

    public void setJanela1(Janela janela1) {
        this.janela1 = janela1;
    }

    public Janela getJanela2() {
        return janela2;
    }

    public void setJanela2(Janela janela2) {
        this.janela2 = janela2;
    }

    public Janela getJanela3() {
        return janela3;
    }

    public void setJanela3(Janela janela3) {
        this.janela3 = janela3;
    }

    public Casa() {
    }

    public Casa(String cor, Janela janela1, Janela janela2, Janela janela3) {
        this.cor = cor;
        this.janela1 = janela1;
        this.janela2 = janela2;
        this.janela3 = janela3;
    }


    public void pinta(String cor){
        this.cor = cor;
    }

    public void quantidadeJanelasAbertas(){
        int i = 0;

        if (janela1.estaAberta()) {
            i++;
        }

        if (janela2.estaAberta()) {
            i++;
        }

        if (janela3.estaAberta()) {
            i++;
        }

        System.out.println("JANELAS ABERTAS: " + i);
    }


}

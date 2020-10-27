package exercicio1;

public class Janela {

    private Boolean aberta;
    private String cor;
    private String dimensaoX;
    private String dimensaoY;
    private String dimensaoZ;

    public Janela() {

    }

    public Janela(Boolean aberta, String cor, String dimensaoX, String dimensaoY, String dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }



    public Boolean getAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(String dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public String getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(String dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public String getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(String dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        aberta = true;
    }
    public void fecha(){
        aberta = false;
    }

    public void pinta(String cor){
        this.cor = cor;
    }
    public boolean estaAberta(){
        return aberta;
    }



}

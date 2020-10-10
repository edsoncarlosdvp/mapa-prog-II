package pacote.app;

public class Senha {
    private String tipo;
    private int num;

    public Senha(String tipo, int num) {
        this.tipo = tipo;
        this.num = num;
    }

    public Senha() {
        this.tipo = "";
        this.num = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}

package model;

public class Filial {
    // private int numFilial;
    private String nomeFilial;

    public Filial() {
    }

    public Filial (String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    // Nome Filial
    public String getNomeFilial() {
        return nomeFilial;
    }
    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }    
    @Override
    public String toString() {
        return nomeFilial;
    }
}






















// @Override
// public String toString() {
//     StringBuffer stringBuffer = new StringBuffer();
//     stringBuffer.append("Fiilial: " + nomeFilial);
//     return stringBuffer.toString();
// }

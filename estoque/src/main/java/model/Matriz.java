package model;

public class Matriz {
    private String regional;

    // Construtor vazio
    // public Matriz() {
    // }

    public Matriz (String regional) {
        this.regional = regional;
    }

    // Nome Regional
    public String getRegional() {
        return regional;
    }
    public void setRegional(String regional) {
        this.regional = regional;
    }    

    @Override
    public String toString() {
        return regional;
    }
}




















// @Override
// public String toString() {
//     StringBuffer stringBuffer = new StringBuffer();
//     stringBuffer.append("Matriz: " + regional);
//     return stringBuffer.toString();
// }
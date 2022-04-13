import java.util.ArrayList;

public class Curso {
   private String nome;
   private double valor;
   private ArrayList<Aulas> aulas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Aulas> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aulas> aulas) {
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", aulas=" + aulas +
                '}';
    }
}

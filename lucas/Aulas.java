public class Aulas {
    private String url;
    private String topico;
    private int numeracao;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "Aulas{" +
                "url='" + url + '\'' +
                ", topico='" + topico + '\'' +
                ", numeracao=" + numeracao +
                '}';
    }
}

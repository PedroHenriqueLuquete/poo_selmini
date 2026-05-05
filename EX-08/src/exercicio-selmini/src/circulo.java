public class circulo {
    private Ponto ponto;
    private double raio;

    public circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        String aux="";
        aux +="Raio: "+raio+"\n";
        aux+=ponto.toString();
        return aux;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


}

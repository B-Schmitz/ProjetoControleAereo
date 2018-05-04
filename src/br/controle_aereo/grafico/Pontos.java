package br.controle_aereo.grafico;

public class Pontos {

    Double x, y, raio, angulo, velocidade, direcao;
    int linha;
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double r) {
        this.raio = r;
    }

    public Double getAngulo() {
        return angulo;
    }

    public void setAngulo(Double ang) {
        this.angulo = ang;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double vel) {
        this.velocidade = vel;
    }

    public Double getDirecao() {
        return direcao;
    }

    public void setDirecao(Double dir) {
        this.direcao = dir;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

}

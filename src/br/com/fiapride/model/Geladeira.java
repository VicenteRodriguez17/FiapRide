package br.com.fiapride.model;

public class Geladeira {

    private String modelo;
    private String cor;
    private int capacidadeMaxima;
    private int volumeAtual;

    // CONSTRUTOR
    public Geladeira(String modelo, String cor, int capacidadeMaxima) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.volumeAtual = 0;
    }

    // GET MODELO
    public String getModelo() {
        return this.modelo;
    }

    // SET MODELO
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // GET COR
    public String getCor() {
        return this.cor;
    }

    // SET COR
    private void setCor(String cor) {
        this.cor = cor;
    }

    // GET CAPACIDADE
    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    // REGRA DE NEGÓCIO
    public void setCapacidadeMaxima(int capacidadeMaxima) {

        if (capacidadeMaxima > 0) {
            this.capacidadeMaxima = capacidadeMaxima;
        } else {
            System.out.println("Erro: capacidade inválida!");
        }
    }

    // GET VOLUME
    public int getVolumeAtual() {
        return this.volumeAtual;
    }

    // ADICIONAR VOLUME
    public void adicionarVolume(int volume) {

        if (volume <= 0) {
            System.out.println("Volume inválido!");
            return;
        }

        if (volumeAtual + volume > capacidadeMaxima) {
            System.out.println("Não cabe na geladeira!");
        } else {
            volumeAtual += volume;
        }
    }

    // REMOVER VOLUME
    public void removerVolume(int volume) {

        if (volume <= 0) {
            System.out.println("Volume inválido!");
            return;
        }

        if (volume > volumeAtual) {
            System.out.println("Não há esse volume para remover!");
        } else {
            volumeAtual -= volume;
        }
    }

    // ESPAÇO DISPONÍVEL
    public int verificarEspacoDisponivel() {
        return capacidadeMaxima - volumeAtual;
    }

    // STATUS
    public void exibirStatus() {

        System.out.println("\nModelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade Máxima: " + capacidadeMaxima + "ml");
        System.out.println("Volume Atual: " + volumeAtual + "ml");
        System.out.println("Espaço Disponível: " + verificarEspacoDisponivel() + "ml");
    }
}

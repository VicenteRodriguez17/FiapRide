package br.com.fiapride.model;

public class Geladeira {

    public String formato;
    public String aparencia;
    public int capacidadeTotalEmMl; 
    public int volumeOcupadoEmMl; 

    public Geladeira(String formato, String aparencia, int capacidadeTotalEmMl) {
        this.formato = formato;
        this.aparencia = aparencia;
        
        if (capacidadeTotalEmMl <= 0) {
            System.out.println("Erro: A capacidade total da geladeira deve ser um valor positivo.");
            this.capacidadeTotalEmMl = 1; 
        } else {
            this.capacidadeTotalEmMl = capacidadeTotalEmMl;
        }
        this.volumeOcupadoEmMl = 0; 
    }

    public void adicionarVolume(int volume) {
    	
        if (volume <= 0) {
            System.out.println("Erro: O volume a ser adicionado deve ser um valor positivo.");
            return;
        }
        
        if (this.volumeOcupadoEmMl + volume > this.capacidadeTotalEmMl) {
            System.out.println("Erro: Capacidade máxima da geladeira excedida. Espaço disponível: " + (this.capacidadeTotalEmMl - this.volumeOcupadoEmMl) + "ml.");
            return;
        }
        this.volumeOcupadoEmMl += volume;
        System.out.println("Volume de " + volume + "ml adicionado. Volume ocupado atual: " + this.volumeOcupadoEmMl + "ml.");
    }

    public void removerVolume(int volume) {
        if (volume <= 0) {
            System.out.println("Erro: O volume a ser removido deve ser um valor positivo.");
            return;
        }
        if (this.volumeOcupadoEmMl - volume < 0) {
            System.out.println("Erro: Não é possível remover mais volume do que o ocupado. Volume ocupado atual: " + this.volumeOcupadoEmMl + "ml.");
            return;
        }
        this.volumeOcupadoEmMl -= volume;
        System.out.println("Volume de " + volume + "ml removido. Volume ocupado atual: " + this.volumeOcupadoEmMl + "ml.");
    }

    public int verificarEspacoDisponivel() {
        return this.capacidadeTotalEmMl - this.volumeOcupadoEmMl;
    }

    public void exibirStatus() {
        System.out.println("\n--- Status da Geladeira ---");
        System.out.println("Formato: " + this.formato);
        System.out.println("Aparência: " + this.aparencia);
        System.out.println("Capacidade Total: " + this.capacidadeTotalEmMl + "ml");
        System.out.println("Volume Ocupado: " + this.volumeOcupadoEmMl + "ml");
        System.out.println("Espaço Disponível: " + verificarEspacoDisponivel() + "ml");
        System.out.println("---------------------------");
    }
}


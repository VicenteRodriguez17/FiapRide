package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("--- Desafio Prático: Teste da Classe Geladeira ---");

        System.out.println("\n### Cenário 1: Criação de Geladeiras ###");
        Geladeira geladeiraPequena = new Geladeira("Compacta", "Branca", 1000); 
        geladeiraPequena.exibirStatus();

        Geladeira geladeiraGrande = new Geladeira("Duplex", "Inox", 5000); 
        geladeiraGrande.exibirStatus();

        Geladeira geladeiraInvalida = new Geladeira("Mini", "Colorida", 0); 
        geladeiraInvalida.exibirStatus(); 

        System.out.println("\n### Cenário 2: Adição de Volume ###");
        geladeiraPequena.adicionarVolume(500); 
        geladeiraPequena.adicionarVolume(300); 
        geladeiraPequena.adicionarVolume(400); 
        geladeiraPequena.adicionarVolume(0);   
        geladeiraPequena.adicionarVolume(-100); 
        geladeiraPequena.exibirStatus();

        System.out.println("\n### Cenário 3: Remoção de Volume ###");
        geladeiraGrande.adicionarVolume(3000); 
        geladeiraGrande.exibirStatus();
        geladeiraGrande.removerVolume(1000); 
        geladeiraGrande.removerVolume(2500); 
        geladeiraGrande.removerVolume(0);   
        geladeiraGrande.removerVolume(-500);
        geladeiraGrande.exibirStatus();

        System.out.println("\n### Cenário 4: Verificação de Espaço Disponível ###");
        System.out.println("Espaço disponível na geladeira pequena: " + geladeiraPequena.verificarEspacoDisponivel() + "ml");
        System.out.println("Espaço disponível na geladeira grande: " + geladeiraGrande.verificarEspacoDisponivel() + "ml");
    }
}


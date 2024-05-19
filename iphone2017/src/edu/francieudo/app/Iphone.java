package edu.francieudo.app;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
       
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        
        System.out.println("Nova Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Atualizando pagina web");
    }

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        
        System.out.println("Atender?");
    }

    @Override
    public void iniciarCorreioVoz() {
        
        System.out.println("iniciar correios de voz");
    }

    @Override
    public void tocar() {
        
        System.out.println("Blaaah Blaaah");
    }

    @Override
    public void pausar() {

        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        
        System.out.println("Tocando a musica " + musica);
    }

    
}

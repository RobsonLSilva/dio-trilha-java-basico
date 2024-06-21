package com.robson.desafioUML.smartphone;

import com.robson.desafioUML.funcionalidades.AparelhoTelefonico;
import com.robson.desafioUML.funcionalidades.NavegadorInternet;
import com.robson.desafioUML.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...\n");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova pagina...\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...\n");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...\n");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica...\n");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
}

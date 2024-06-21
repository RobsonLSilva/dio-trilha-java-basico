package com.robson.desafioUML.applications;

import com.robson.desafioUML.exceptions.EscolhaException;
import com.robson.desafioUML.smartphone.Iphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Iphone iphone = new Iphone();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println( "                                     1111                   \n" +
                            "                                  1111111                   \n" +
                            "                                11111111                    \n" +
                            "                               111111111                    \n" +
                            "                              111111111                     \n" +
                            "                              11111111                      \n" +
                            "                             1111111                        \n" +
                            "                             11111                          \n" +
                            "                 111111             111111                  \n" +
                            "              1111111111111      111111111111111            \n" +
                            "            111111111111111111111111111111111111111         \n" +
                            "           11111111111111111111111111111111111111111        \n" +
                            "         111111111111111111111111111111111111111111         \n" +
                            "        111111111111111111111111111111111111111111          \n" +
                            "       11111111111111111111111111111111111111111            \n" +
                            "      11111111111111111111111111111111111111111             \n" +
                            "     11111111111111111111111111111111111111111              \n" +
                            "     11111111111111111111111111111111111111111              \n" +
                            "     11111111111111111111111111111111111111111              \n" +
                            "     11111111111111111111111111111111111111111              \n" +
                            "     11111111111111111111111111111111111111111              \n" +
                            "     111111111111111111111111111111111111111111             \n" +
                            "     1111111111111111111111111111111111111111111            \n" +
                            "      1111111111111111111111111111111111111111111           \n" +
                            "      111111111111111111111111111111111111111111111         \n" +
                            "       1111111111111111111111111111111111111111111111       \n" +
                            "        111111111111111111111111111111111111111111111       \n" +
                            "         11111111111111111111111111111111111111111111       \n" +
                            "          111111111111111111111111111111111111111111        \n" +
                            "           1111111111111111111111111111111111111111         \n" +
                            "            11111111111111111111111111111111111111          \n" +
                            "             111111111111111111111111111111111111           \n" +
                            "               111111111111111111111111111111111            \n" +
                            "                111111111111111111111111111111              \n" +
                            "                  11111111           11111111               \n");

        System.out.print("=============================\n" +
                         "|***** Seja Bem vindo! *****|\n" +
                         "=============================\n" +
                         "************ MENU ***********\n");

        System.out.print("1 - TELEFONE \n" +
                         "2 - MÚSICA   \n" +
                         "3 - INTERNET \n" +
                         "0 - ENCERRAR \n");

        System.out.println("POR FAVOR, ESCOLHA UMA OPÇÃO: ");
        int escolha = Integer.parseInt(reader.readLine());

        if(escolha == 1 || escolha == 2 || escolha == 3 || escolha == 0 ) {
            while (escolha != 0) {
                switch (escolha) {
                    case 1: {
                        System.out.println("****** TELEFONE ******\n" +
                                "1 - LIGAR \n" +
                                "2 - ATENDER \n" +
                                "3 - INICIAR CORREIO DE VOZ \n" +
                                "4 - VOLTAR MENU");

                        System.out.println("ESCOLHA UMA OPÇÃO: ");
                        int opcao = Integer.parseInt(reader.readLine());

                        if (opcao == 1) {
                            iphone.ligar("11987654321");
                        } else if (opcao == 2) {
                            iphone.atender();
                        } else if (opcao == 3) {
                            iphone.iniciarCorreioVoz();
                        } else if (opcao == 4) {
                            escolha = 4;
                        } else {
                            System.out.println("OPÇÃO INVALIDA");
                        }
                        continue;
                    }

                    case 2: {
                        System.out.println("****** MÚSICA ******\n" +
                                "1 - SELECIONAR MÚSICA\n" +
                                "2 - TOCAR\n" +
                                "3 - PAUSAR\n" +
                                "4 - VOLTAR MENU");

                        System.out.println("DIGITE A OPÇÃO ESCOLHIDA: ");
                        int opcao = Integer.parseInt(reader.readLine());

                        if (opcao == 1) {
                            iphone.selecionarMusica("A Day in the Life");
                        } else if (opcao == 2) {
                            iphone.tocar();
                        } else if (opcao == 3) {
                            iphone.pausar();
                        } else if (opcao == 4) {
                            escolha = 4;
                        } else {
                            System.out.println("OPÇÃO INVALIDA");
                        }
                        continue;
                    }
                    case 3: {
                        System.out.println("****** NAVEGAR NA INTERNET ******\n" +
                                "1 - EXIBIR PAGINA WEB \n" +
                                "2 - ATUALIZAR PAGINA \n" +
                                "3 - ADICIONAR PAGINA \n" +
                                "4 - VOLTAR MENU");

                        System.out.println("ESCOLHA UMA OPÇÃO: ");
                        int opcao = Integer.parseInt(reader.readLine());

                        if (opcao == 1) {
                            iphone.exibirPagina("https://www.dio.me/bootcamp");
                        } else if (opcao == 2) {
                            iphone.atualizarPagina();
                        } else if (opcao == 3) {
                            iphone.adicionarNovaPagina();
                        } else if (opcao == 4) {
                            escolha = 4;
                        } else {
                            System.out.println("OPÇÃO INVALIDA");
                        }
                        continue;
                    }
                    case 4: {
                        System.out.println("****** MENU ******");

                        System.out.println("1 - TELEFONE \n" +
                                "2 - MÚSICA   \n" +
                                "3 - INTERNET \n" +
                                "0 - ENCERRAR \n");
                        System.out.println("POR FAVOR, ESCOLHA UMA OPÇÃO: ");
                        escolha = Integer.parseInt(reader.readLine());
                        break;
                    }
                }

            }
        }else
            throw new EscolhaException("Opção invalida, verifique!");

        System.out.println("DESLIGANDO IPHONE, ATÉ MAIS!!!");
        reader.close();
    }
}
package Imobiliaria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Imobiliaria {

    public static void main(String[] args) throws IOException {
        ArrayList<Casa> ListaCasas = new ArrayList();
        ArrayList<Apartamento> ListaApartamentos = new ArrayList();

        
        //Grupo:  Kevenn Henrique de Paula Silva
        //        Izabella Terêncio da Silva Assis
        //        Lucas Batista dos Santos
        
        
        //Imoveis ja cadastrados na Imobiliaria
        Casa c1 = new Casa(4, 3, 344, true, false, true, false, true, true);
        Casa c2 = new Casa(5, 5, 700, true, true, false, true, true, true);
        Casa c3 = new Casa(2, 1, 150, false, true, false, false, true, false, 100);

        Apartamento p1 = new Apartamento(true, true, true, 10, 6, 5, 150, true, false);
        Apartamento p2 = new Apartamento(false, false, false, 5, 2, 1, 100, false, true);
        Apartamento p3 = new Apartamento(true, true, false, 7, 2, 3, 100, true, false, 150);

        ListaCasas.add(c1);
        ListaCasas.add(c2);
        ListaCasas.add(c3);

        ListaApartamentos.add(p1);
        ListaApartamentos.add(p2);
        ListaApartamentos.add(p3);
        //fimCadastro

        Scanner input = new Scanner(System.in);
        int resp = 0;
        do {
            System.out.println("QUAL OPÇÃO DESEJA ACESSAR:");
            System.out.println("1-MENU-PRINCIPAL: (Status/AvaliarImovel/MarcarReformado/MarcarComoVendido) ");
            System.out.println("2-MENU-CONFIGURAÇÕES: (Mostrar/Inserir/deletar)");
            System.out.println("3-Quantidade de imoveis já cadastrados nesta imobiliaria ao longo de sua existencia");
            System.out.println("4-SAIR");

            boolean erro=false;

            resp=controleDeErro(resp, input);

            limparTela();

            switch (resp) {
                case 1:
                    do {
                        System.out.println("Qual opção deseja acessar:");
                        System.out.println("1-Mostrar todos os imoveis e seus status");
                        System.out.println("2-Consultar preço dos Imoveis");
                        System.out.println("3-Marcar como Reformado");
                        System.out.println("4-Marcar como vendido");
                        System.out.println("5-Voltar");

                        resp=controleDeErro(resp, input);

                        limparTela();
                        switch (resp) {
                            case 1:
                                System.out.println("OS STATUS DE TODOS OS IMOVEIS CADASTRADOS SÃO:");
                                System.out.println(" ");
                                for (int i = 0; i < ListaCasas.size(); i++) {
                                    System.out.println("========   Esta é a CASA de Nº: " + i + "    ========");
                                    ListaCasas.get(i).status();
                                    System.out.println(" ");

                                }
                                for (int i = 0; i < ListaApartamentos.size(); i++) {
                                    System.out.println("========    Esta é a APARTAMENTO de Nº: " + i + "    ========");
                                    ListaApartamentos.get(i).status();
                                    System.out.println(" ");
                                }
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para voltar");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                            case 2:
                                System.out.println("Valores de todos os imoveis cadastrados:");
                                System.out.println("(Olhe o número do imovel na opção 1, 'Mostrar') ");
                                System.out.println("-----------------CASAS----------------");
                                for (int i = 0; i < ListaCasas.size(); i++) {
                                    System.out.println("CASA de Nº: " + i);
                                    ListaCasas.get(i).avaliarImovel();
                                    System.out.println(" ");
                                }
                                System.out.println("-----------------APARTAMENTOS----------------");
                                for (int i = 0; i < ListaApartamentos.size(); i++) {
                                    System.out.println("APARTAMENTO de Nº: " + i);
                                    ListaApartamentos.get(i).avaliarImovel();
                                    System.out.println(" ");
                                }
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para voltar");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                            case 3:
                                System.out.println("Marcar um imovel como reformado fará com que ele se torne de Classe 5 e aumente seu valor!");
                                System.out.println(" ");
                                System.out.println("Você deseja reformar:");
                                System.out.println("1- uma CASA");
                                System.out.println("2- um APARTAMENTO");
                                resp=controleDeErro(resp, input);
                                limparTela();
                                switch (resp) {
                                    case 1:
                                        System.out.println("Digite o número da casa que deseja reformar:");
                                        System.out.println("(Olhe o número do imovel na opção 1, 'Mostrar') ");
                                        int num = 0;
                                        num=controleDeErro(num, input);
                                        ListaCasas.get(num).reformado();
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    case 2:
                                        System.out.println("Digite o número do apartamento que deseja reformar:");
                                        System.out.println("(Olhe o número do imovel na opção 1, 'Mostrar') ");
                                        int num2 = 0;
                                        num2=controleDeErro(num2, input);
                                        ListaApartamentos.get(num2).reformado();
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    default:
                                        System.out.println("Esta opção não é valida, redirecionado ao menu!!!!!!!    (AS OPÇÕES VALIDAS SAO : 1,2)");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Marcar um imovel como vendido fará com que seu status mude para 'false' !!!");
                                System.out.println(" ");
                                System.out.println("Você deseja marcar como vendido:");
                                System.out.println("1- uma CASA");
                                System.out.println("2- um APARTAMENTO");
                                resp=controleDeErro(resp, input);
                                limparTela();
                                switch (resp) {
                                    case 1:
                                        System.out.println("Digite o número da casa que deseja marcar como vendido:");
                                        System.out.println("(Olhe o número do imovel na opção 1, 'Mostrar') ");
                                        int num = 0;
                                        num=controleDeErro(num, input);
                                        ListaCasas.get(num).marcarComoVendido();
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    case 2:
                                        System.out.println("Digite o número do apartamento que deseja marcar como vendido:");
                                        System.out.println("(Olhe o número do imovel na opção 1, 'Mostrar') ");
                                        int num2 = 0;
                                        num2=controleDeErro(num2, input);
                                        ListaApartamentos.get(num2).marcarComoVendido();
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    default:
                                        System.out.println("Esta opção não é valida, redirecionado ao menu!!!!!!!    (AS OPÇÕES VALIDAS SAO : 1,2)");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                }

                                break;
                            case 5:
                                System.out.println("Voltando!!!");
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para voltar");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                            default:
                                System.out.println("Esta opção não é valida    (AS OPÇÕES VALIDAS SAO!!!!!!! : 1,2,3,4,5)");
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para sair");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                        }
                    } while (resp != 5);
                    break;
                case 2:
                    do {
                        System.out.println("Qual opção deseja acessar:");
                        System.out.println("1-Mostrar");
                        System.out.println("2-Inserir");
                        System.out.println("3-Deletar");
                        System.out.println("4-Voltar");
                        resp=controleDeErro(resp, input);
                        limparTela();
                        switch (resp) {
                            case 1:
                                System.out.println("TODOS OS IMOVEIS CADASTRADOS: ");
                                System.out.println(" ");
                                for (int i = 0; i < ListaCasas.size(); i++) {
                                    System.out.println("========   Esta é a CASA de Nº: " + i + "    ========");
                                    ListaCasas.get(i).status();
                                    System.out.println(" ");

                                }
                                for (int i = 0; i < ListaApartamentos.size(); i++) {
                                    System.out.println("========    Esta é a APARTAMENTO de Nº: " + i + "    ========");
                                    ListaApartamentos.get(i).status();
                                    System.out.println(" ");
                                }
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para sair");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                            case 2:
                                System.out.println("Você deseja inserir:");
                                System.out.println("1-uma CASA");
                                System.out.println("2-um APARTAMENTO");
                                resp=controleDeErro(resp, input);
                                limparTela();
                                switch (resp) {
                                    case 1:
                                        System.out.println("DIGITE:");
                                        int classe = 0;
                                        do {
                                            System.out.println("Qual a classe da casa:(De 1 a 5)");
                                            classe=controleDeErro(classe, input);
                                            if ((classe < 1 || classe > 5)) {
                                                System.out.println("A classe é de 1 a 5, digite CORRETAMENTE");
                                            }
                                        } while (classe < 1 || classe > 5);
                                        System.out.println("Quantos quartos há na casa:");
                                        int qtQuartos = 0;
                                        qtQuartos=controleDeErro(qtQuartos, input);
                                        System.out.println("Qual o tamanho em metros quadrados:(Digite apenas o número inteiro referente ao tamanho)");
                                        int tamanho = 0;
                                        tamanho=controleDeErro(tamanho, input);
                                        System.out.println("Possui suite? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean suite=false;
                                        suite=controleDeErroBoolean( suite,input);
                                        System.out.println("Possui quintal? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean quintal = false;
                                        quintal=controleDeErroBoolean(quintal,input);
                                        System.out.println("Possui garagem? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean garagem = false;
                                        garagem=controleDeErroBoolean( garagem,input);
                                        System.out.println("Possui Piscina? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean pscina = false;
                                        pscina=controleDeErroBoolean( pscina,input);
                                        System.out.println("A casa está a venda?Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean avenda = false;
                                        avenda=controleDeErroBoolean(avenda,input);
                                        System.out.println("A casa é alugavel?Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean alugavel = false;
                                        alugavel=controleDeErroBoolean( alugavel,input);
                                        int n = ListaCasas.size() - 1;
                                        n++;
                                        limparTela();
                                        System.out.println("Você deseja inserir o valor da casa? "
                                                + "\n(Caso não queira, nós iremos avaliar automaticamente com base nos atributos dela!!!)"
                                                + "\nDIGITE 'SIM' OU 'NÃO' !!!");
                                        String quero = input.next();
                                        if ("sim".equals(quero) || "s".equals(quero) || "SIM".equals(quero) || "S".equals(quero)) {
                                            System.out.println("Digite o valor da casa:");
                                            float valor = input.nextFloat();
                                            Casa cn = new Casa(qtQuartos, classe, tamanho, suite, avenda, alugavel, quintal, garagem, pscina, valor);
                                            ListaCasas.add(cn);
                                        } else if ("não".equals(quero) || "n".equals(quero) || "NÃO".equals(quero) || "N".equals(quero) || "nao".equals(quero) || "NAO".equals(quero)) {
                                            Casa cn = new Casa(qtQuartos, classe, tamanho, suite, avenda, alugavel, quintal, garagem, pscina);
                                            ListaCasas.add(cn);
                                        } else {
                                            System.out.println("Entrada invalida, é permitido apenas 'sim' e 'não', redirecionado para o menu");
                                            System.in.read();
                                            limparTela();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("DIGITE:");
                                        int classe2;
                                        do {
                                            System.out.println("Qual a classe do apartamento :(De 1 a 5)");
                                            classe2 = 0;
                                            classe2=controleDeErro(classe2, input);
                                            if ((classe2 < 1 || classe2 > 5)) {
                                                System.out.println("A classe é de 1 a 5, digite CORRETAMENTE");
                                            }
                                        } while (classe2 < 1 || classe2 > 5);
                                        System.out.println("Quantos quartos há no apartamento:");
                                        int qtQuartos2 = 0;
                                        qtQuartos2=controleDeErro(qtQuartos2, input);
                                        System.out.println("Qual o tamanho em metros quadrados:(Digite apenas o número inteiro referente ao tamanho)");
                                        int tamanho2 = 0;
                                        tamanho2=controleDeErro(tamanho2, input);
                                        System.out.println("Possui suite? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean suite2 = false;
                                        suite2=controleDeErroBoolean( suite2,input);
                                        System.out.println("Possui lavanderia? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean lavanderia = false;
                                        lavanderia=controleDeErroBoolean( lavanderia,input);
                                        System.out.println("Possui estacionamento? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean estacionamento = false;
                                        estacionamento=controleDeErroBoolean( estacionamento,input);
                                        System.out.println("Qual andar fica seu apartamento?");
                                        int andar = 0;
                                        andar=controleDeErro(andar, input);
                                        System.out.println("O apartamento está a venda? Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean avenda2 = false;
                                        avenda2=controleDeErroBoolean( avenda2,input);
                                        System.out.println("O apartamento é alugavel?Caso sim, digite true, caso nao, digite false!!! (true/false)");
                                        boolean alugavel2 = false;
                                        alugavel2=controleDeErroBoolean( alugavel2,input);
                                        int n2 = ListaApartamentos.size() - 1;
                                        n2++;
                                        limparTela();
                                        System.out.println("Você deseja inserir o valor do apartamento? "
                                                + "\n(Caso não queira, nós iremos avaliar automaticamente com base nos atributos dela!!!)"
                                                + "\nDIGITE 'SIM' OU 'NÃO' !!!");
                                        String quero2 = input.next();
                                        if ("sim".equals(quero2) || "s".equals(quero2) || "SIM".equals(quero2) || "S".equals(quero2)) {
                                            System.out.println("Digite o valor do apartamento:");
                                            float valor = input.nextFloat();
                                            Apartamento pn = new Apartamento(lavanderia, estacionamento, suite2, andar, qtQuartos2, classe2, tamanho2, avenda2, alugavel2, valor);
                                            ListaApartamentos.add(pn);
                                        } else if ("não".equals(quero2) || "n".equals(quero2) || "NÃO".equals(quero2) || "N".equals(quero2) || "nao".equals(quero2) || "NAO".equals(quero2)) {
                                            Apartamento pn = new Apartamento(lavanderia, estacionamento, suite2, andar, qtQuartos2, classe2, tamanho2, avenda2, alugavel2);
                                            ListaApartamentos.add(pn);

                                        } else {
                                            System.out.println("Entrada invalida, é permitido apenas 'sim' e 'não' redirecionado para o menu");
                                            System.in.read();
                                            limparTela();
                                        }
                                        break;
                                    default:
                                        System.out.println("Esta opção não é valida, redirecionado ao menu!!!!!!!    (AS OPÇÕES VALIDAS SAO : 1,2)");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para sair");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Você deseja deletar da lista:");
                                System.out.println("1-uma casa");
                                System.out.println("2-um apartamento");
                                resp=controleDeErro(resp, input);
                                limparTela();
                                int num;
                                switch (resp) {
                                    case 1:
                                        System.out.println("Digite o número da casa que deseja deletar da lista"
                                                + " \n(olhe o numero da casa na opção 1, 'Mostrar' )");
                                        num = 0;
                                        num=controleDeErro(num, input);
                                        ListaCasas.remove(num);
                                        System.out.println("Removido com Sucesso");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    case 2:
                                        System.out.println("Digite o número do apartamento que deseja deletar da lista"
                                                + " \n(olhe o numero do apartamento na opção 1, 'Mostrar' )");
                                        num = 0;
                                        num=controleDeErro(num, input);
                                        ListaApartamentos.remove(num);
                                        System.out.println("Removido com Sucesso");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                    default:
                                        System.out.println("Esta opção não é valida, redirecionado ao menu!!!!!!!    (AS OPÇÕES VALIDAS SAO : 1,2)");
                                        System.out.println("----------------------");
                                        System.out.println("Aperte ENTER para voltar");
                                        System.out.println("----------------------");
                                        System.in.read();
                                        limparTela();
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Voltando!!!");
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para voltar");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                            default:
                                System.out.println("Esta opção não é valida!!!!!!!    (AS OPÇÕES VALIDAS SAO : 1,2,3,4)");
                                System.out.println("----------------------");
                                System.out.println("Aperte ENTER para voltar");
                                System.out.println("----------------------");
                                System.in.read();
                                limparTela();
                                break;
                        }
                    } while (resp != 4);
                    resp=0;
                    break;
                case 3:
                    Imovel.numDeImoveis();
                    System.out.println("----------------------");
                    System.out.println("Aperte ENTER para sair");
                    System.out.println("----------------------");
                    System.in.read();
                    limparTela();
                    break;
                case 4:
                    System.out.println("----------------------");
                    System.out.println("Aperte ENTER para sair");
                    System.out.println("----------------------");
                    System.in.read();
                    limparTela();
                    break;
                default:
                    System.out.println("Esta opção não é valida!!!!!!!   (AS OPÇÕES VALIDAS SAO : 1,2,3)");
                    System.out.println("----------------------");
                    System.out.println("Aperte ENTER para voltar");
                    System.out.println("----------------------");
                    System.in.read();
                    limparTela();
                    break;
            }
        } while (resp != 4);
    }

    public static void limparTela() {
        //limpar a tela
        for (int i = 0; i < 10; i++) {
            System.out.println(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
        }//telaLimpa
    }

    public static int controleDeErro(int resp, Scanner input) {
        boolean erro;
        do {
            erro = false;
            try {
                resp = input.nextInt();
            } catch (Exception e) {
                System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                System.out.println("Entrada invalida, obeserve as opçôes atentamente e tente novamente");
                input.nextLine();
                erro = true;
            }
        } while (erro);
        return resp;
    }

    public static boolean controleDeErroBoolean(boolean bo, Scanner input) {
        boolean erro;
        do {
            erro = false;
            try {
                bo = input.nextBoolean();
            } catch (Exception e) {
                System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                System.out.println("Entrada invalida, obeserve as opçôes atentamente e tente novamente!!");
                System.out.println("É permitido digitar apenas 'true' e 'false'");
                input.nextLine();
                erro = true;
            }
        } while (erro);
        return bo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author muangala Jr
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PessoaFisicaRepo pessoFR = new PessoaFisicaRepo();
    private static PessoaJuridicaRepo pessoaJR = new PessoaJuridicaRepo();

    public static void main(String[] args) {
      int opcao;
      do{
          exibirOpcoes();
          opcao=scanner.nextInt();
          
          switch (opcao) {
                case 1:
                    incluir();
                    break;
                case 2:
                    alterar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    exibirPorId();
                    break;
                case 5:
                    exibirTodos();
                    break;
                case 6:
                    salvarDados();
                    break;
                case 7:
                    recuperarDados();
                    break;
                case 0:
                    System.out.println("Finalizando execução.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
    
    private static void exibirOpcoes(){
         System.out.println("Selecione a opção:");
        System.out.println("1 - Incluir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Exibir pelo ID");
        System.out.println("5 - Exibir todos");
        System.out.println("6 - Salvar dados");
        System.out.println("7 - Recuperar dados");
        System.out.println("0 - Finalizar execução");
    }
    
    private static void incluir(){
         System.out.println("Escolha o tipo:");
    System.out.println("1 - Pessoa Física");
    System.out.println("2 - Pessoa Jurídica");

    int tipo = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner

    if (tipo == 1) {
        System.out.println("Inserir dados da Pessoa Física:");

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Criar uma instância de PessoaFisica com os dados fornecidos pelo usuário
        PessoaFisica pessoaF = new PessoaFisica(cpf, idade, id, nome);
        PessoaFisicaRepo pessoaFR = new PessoaFisicaRepo();
        // Adicionar pessoaF ao repositório de pessoas físicas
        pessoaFR.inserir(); // Lembre-se de ajustar o nome do repositório
        System.out.println("Adicionando pessoa física...");
        }else if(tipo == 2){
            PessoaJuridica pessoaJ = new PessoaJuridica("111", 1, "Daniela");
            System.out.println("Adicionando pessoa Jurídica...");
        }else {
            System.out.println("Opção inválida.");
        }
        
    }
    
    
    private static void alterar() {
        // Implementar lógica para alterar pessoa física ou jurídica por ID
        System.out.println("Opção de alteração escolhida.");
        PessoaFisicaRepo pessoaFR = new PessoaFisicaRepo();
        PessoaFisica pessoa = new PessoaFisica("111.333", 30, 1, "Muangala");
        pessoaFR.alterar(pessoa);
        
        System.out.println("Opção de alteração escolhida.");
        PessoaJuridicaRepo pessoaJR = new PessoaJuridicaRepo();
        PessoaJuridica pessoa1 = new PessoaJuridica("1123", 1, "Mateus");
        pessoaJR.alterar(pessoa1);
    }

    private static void excluir() {
        // Implementar lógica para excluir pessoa física ou jurídica por ID
        System.out.println("Opção de exclusão escolhida.");
    }

    private static void exibirPorId() {
        // Implementar lógica para exibir pessoa física ou jurídica por ID
        System.out.println("Opção de exibição por ID escolhida.");
    }

    private static void exibirTodos() {
        // Implementar lógica para exibir todas as pessoas físicas ou jurídicas
        System.out.println("Opção de exibição de todos escolhida.");
    }

    private static void salvarDados() {
        // Implementar lógica para salvar dados de pessoas físicas e jurídicas em arquivos
        System.out.println("Opção de salvar dados escolhida.");
    }

    private static void recuperarDados() {
        // Implementar lógica para recuperar dados de pessoas físicas e jurídicas de arquivos
        System.out.println("Opção de recuperar dados escolhida.");
    }
}
      
       
    


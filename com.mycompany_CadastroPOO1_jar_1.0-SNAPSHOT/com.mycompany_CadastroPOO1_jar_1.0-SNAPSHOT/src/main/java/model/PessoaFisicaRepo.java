/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author muangala Jr
 */
public class PessoaFisicaRepo {
     private List<PessoaFisica> pessoasFisicas; // ArrayList privado para armazenar objetos PessoaFisica
     private Scanner scanner;
     
      public PessoaFisicaRepo() {
        this.pessoasFisicas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
      
      
      // Método para inserir PessoaFisica
     public void inserir() {
        System.out.println("Inserir nova Pessoa Física:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Outros dados (endereço, telefone, etc.): ");
        String outrosDados = scanner.nextLine();

        // Supondo que sua classe PessoaFisica tenha um construtor que aceite esses atributos
        //PessoaFisica novaPessoa = new PessoaFisica("", 0, 0, "");
        inserir();
    }
      
      
      // Método para alterar PessoaFisica por índice
    public void alterar(PessoaFisica pessoa) {
        int index = -1;
        for (int i = 0; i < pessoasFisicas.size(); i++) {
            if (pessoasFisicas.get(i).getId() == pessoa.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            pessoasFisicas.set(index, pessoa);
        }
    }
    
    
     // Método para excluir PessoaFisica por índice
     public void excluir(int id) {
        pessoasFisicas.removeIf(pessoa -> pessoa.getId() == id);
    }
     
     public List<PessoaFisica> obterTodos() {
        return pessoasFisicas;
    }
    
    
    // Método para obter PessoaFisica por índice
    public PessoaFisica obter(int id) {
        for (PessoaFisica pessoa : pessoasFisicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
    
   public void mostrarTodasPessoasFisicas() {
        List<PessoaFisica> todasPessoasFisicas = obterTodos();
        for (PessoaFisica pessoa : todasPessoasFisicas) {
            // Fazer algo com cada pessoa física (por exemplo, imprimir seus dados)
            System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
        }
    }
    
    
    // Método para obter todas as PessoaFisica
    /*
    public List<PessoaFisica> obterTodos() {
        return pessoasFisicas;
    }*/
    
    
    // Método para persistir os dados em um arquivo
     public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(pessoasFisicas);
            System.out.println("Dados salvos com sucesso no arquivo: " + nomeArquivo);
        }
    }
    
    // Método para recuperar os dados do arquivo
   public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoasFisicas = (List<PessoaFisica>) inputStream.readObject();
            System.out.println("Dados recuperados com sucesso do arquivo: " + nomeArquivo);
        }
    }
    
}

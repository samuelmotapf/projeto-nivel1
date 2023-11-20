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

/**
 *
 * @author muangala Jr
 */
public class PessoaJuridicaRepo {
    private List<PessoaJuridica> pessoasJuridicas;

    public PessoaJuridicaRepo() {
        this.pessoasJuridicas = new ArrayList<>();
    }
    
     // Método para inserir PessoaJuridica
    public void inserir(PessoaJuridica pessoa) {
        pessoasJuridicas.add(pessoa);
    }
    
     // Método para alterar PessoaJuridica por índice
    public void alterar(PessoaJuridica pessoa) {
        int index = -1;
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            if (pessoasJuridicas.get(i).getId() == pessoa.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            pessoasJuridicas.set(index, pessoa);
        }
    }
    
      // Método para excluir PessoaJuridica por índice
    public void excluir(int id) {
        pessoasJuridicas.removeIf(pessoa -> pessoa.getId() == id);
    }

     public List<PessoaJuridica> obterTodos() {
        return pessoasJuridicas;
    }
    
    
    // Método para obter PessoaJuridica por índice
   public PessoaJuridica obter(int id) {
        for (PessoaJuridica pessoa : pessoasJuridicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
   
    public List<PessoaJuridica> obterTodasPessoasJuridicas() {
        return new ArrayList<>(pessoasJuridicas); // Retorna uma cópia da lista para evitar alterações indesejadas
    }

    // Método para exibir todas as pessoas jurídicas no repositório
    public void mostrarTodasPessoasJuridicas() {
        List<PessoaJuridica> todasPessoasJuridicas = obterTodasPessoasJuridicas();
        for (PessoaJuridica pessoa : todasPessoasJuridicas) {
            // Fazer algo com cada pessoa jurídica (por exemplo, imprimir seus dados)
            System.out.println(pessoa.getId()+" - "+ pessoa.getNome() + " - " + pessoa.getCnpj());
        }
    }
    
     // Método para obter todas as PessoaJuridica
   /*
    public List<PessoaJuridica> obterTodos() {
        return pessoasJuridicas;
    }*/

    
    // Método para persistir os dados em um arquivo
    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(pessoasJuridicas);
            System.out.println("Dados salvos com sucesso no arquivo: " + nomeArquivo);
        }
    }
    
    // Método para recuperar os dados do arquivo
    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoasJuridicas = (List<PessoaJuridica>) inputStream.readObject();
            System.out.println("Dados recuperados com sucesso do arquivo: " + nomeArquivo);
        }
    }

}

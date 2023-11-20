/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author muangala Jr
 */
public class Main {

    public static void main(String[] args) {
       // Instanciando o repositório de pessoas físicas
       PessoaFisicaRepo repo1 = new PessoaFisicaRepo(); 
       
       // Instanciando o repositório de pessoas Jurídicas
       PessoaJuridicaRepo repo2 = new PessoaJuridicaRepo();

       
       // Exemplo de criação de uma pessoa física
       PessoaFisica pessoa1 = new PessoaFisica("000.234", 25, 0, "Domingos");       
       PessoaFisica pessoa2 = new PessoaFisica("111.222", 30, 2, "Adriano Silva");
       
       // Exemplo de criação de uma pessoa física
       PessoaJuridica pessoaj1 = new PessoaJuridica("1234", 1, "Daniel");      
       PessoaJuridica pessoaj2 = new PessoaJuridica("000223", 2, "Pedro António");


       
       // Adicionando pessoa física ao repositório
       repo1.inserir(pessoa1);       
       repo1.inserir(pessoa2);
       
       // Adicionando pessoa Jurídica ao repositório
       repo2.inserir(pessoaj1);       
       repo2.inserir(pessoaj2);


       
       // Exemplo de obtenção de todas as pessoas físicas no repositório
        System.out.println("============Pessoa Física==============");
       repo1.mostrarTodasPessoasFisicas();
       System.out.println("============Pessoa Jurídica==============");
       repo2.mostrarTodasPessoasJuridicas();
       
    }
}

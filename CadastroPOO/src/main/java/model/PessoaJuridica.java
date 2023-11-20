/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author muangala Jr
 */
public class PessoaJuridica extends Pessoa implements Serializable{
    private String cnpj;

    public PessoaJuridica(int id, String nome,String cnpj) {
        super(id, nome);
    }

    public PessoaJuridica(String cnpj, int id, String nome) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    // Método exibir polimórfico, sobrescrevendo o método da classe Pai (Pessoa)
    @Override
    public void exibir() {
        super.exibir(); // Chama o método exibir da classe Pai (Pessoa)
        System.out.println("CNPJ: " + cnpj);
    }
}

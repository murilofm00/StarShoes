/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starshoes;

/**
 *
 * @author Murilo Fernandes
 */
public abstract class Pessoa {
    private String cpf;
    private String telefone;
    private String nome;
    private Endereco endereco;
    private float saldo;
    private int codigo;

    public Pessoa() {
        saldo = 0;
        endereco = new Endereco();
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void criarCodigo(int codigo) {
        setCodigo(codigo + 10000);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void setEndereco(String rua, int numero, String bairro, String cep, String cidade, String uf, String complemento) {
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        endereco.setUf(uf);
        endereco.setComplemento(complemento);
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco(String info) {
        System.out.println("Chegou na Pessoa.");
        switch(info) {
            case "rua":
                return endereco.getRua();
            case "num":
                return Integer.toString(endereco.getNumero());
            case "bai":
                return endereco.getBairro();
            case "cep":
                return endereco.getCep();
            case "cid":
                return endereco.getCidade();
            case "uf":
                return endereco.getUf();
            case "com":
                return endereco.getComplemento();
        }
        
        return null;
    }
    
    public abstract void adicionarSaldo();
}
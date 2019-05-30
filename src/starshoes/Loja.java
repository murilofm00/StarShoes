/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starshoes;

import java.util.ArrayList;

/**
 *
 * @author Murilo Fernandes
 */
public class Loja {
    private String cnpj;
    private String nomeFantasia;
    private String telefone;
    private Endereco endereco;
    private ArrayList <Tenis> estoque;
    private ArrayList <Vendedor> vendedores;
    private ArrayList <Cliente> clientes;
    private ArrayList <Venda> vendas;
    
    public Loja() {
        estoque = new ArrayList<Tenis>();
        vendedores = new ArrayList<Vendedor>();
        clientes = new ArrayList<Cliente>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public int adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        clientes.get(clientes.size()-1).criarCodigo(clientes.size()-1);
        
        return clientes.get(clientes.size()-1).getCodigo();
    }
    
    public int adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        vendedores.get(vendedores.size()-1).criarCodigo(vendedores.size()-1);
        
        return vendedores.get(vendedores.size()-1).getCodigo();
    }
    
    public int adicionarTenis(Tenis tenis) {
        estoque.add(tenis);
        estoque.get(estoque.size()-1).criarCodigo(estoque.size()-1);
        
        return estoque.get(estoque.size() -1).getCodigo();
    }
    
    public Cliente procurarCliente(int codigo) {
        return clientes.get(codigo - 50000);
    }
    
    public Cliente procurarCliente(String cpf) {
        for(int i = 0; i < clientes.size() ; i++) {
            if(clientes.get(i).getCpf().equals(cpf)) {
                return clientes.get(i);
            }
        }
        return null;
    }
    
    public Vendedor procurarVendedor(int codigo) {
        return vendedores.get(codigo - 30000);
    }
    
    public Vendedor procurarVendedor(String cpf) {
        for(int i = 0; i < vendedores.size() ; i++) {
            if(vendedores.get(i).getCpf().equals(cpf)) {
                return vendedores.get(i);
            }
        }
        return null;
    }
    
    public Tenis procurarTenis(int codigo) {
        return estoque.get(codigo - 20000);
    }
    
    public int lancarVenda(Venda venda) {
        vendas.add(venda);
        vendas.get(vendas.size()-1).criarCodigo(vendas.size()-1);
        
        procurarTenis(venda.getTenis().getCodigo()).subtraiQtdeEstoque(venda.getQuantidade());
        procurarVendedor(venda.getVendedor().getCodigo()).somaComissao(venda.getValorCompra());
        procurarCliente(venda.getCliente().getCodigo()).addValorDeve(venda.calculaValorEmAberto());
        
        return vendas.get(vendas.size() -1).getCodigo();
    }
}

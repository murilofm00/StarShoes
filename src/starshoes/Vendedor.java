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
public class Vendedor extends Pessoa {
    private float porcentComissao;
    private float valorVendido;

    public Vendedor() {
        porcentComissao = 3/100;
    }
    
    public float getPorcentComissao() {
        return porcentComissao;
    }

    public void setPorcentComissao(float porcentComissao) {
        this.porcentComissao = porcentComissao/100;
    }

    public float getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(float valorVendido) {
        this.valorVendido = valorVendido;
    }
    
    @Override
    public void criarCodigo(int codigo) {
        setCodigo(codigo + 30000);
    }
    
    @Override
    public void adicionarSaldo() {
        float saldo;
        saldo = porcentComissao * valorVendido;
        setSaldo(saldo);
    }
    
    public float calculaComissao() {
        return valorVendido * porcentComissao;
    }
}

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
public class Cliente extends Pessoa {
    private float valorDeve;

    public Cliente() {
        valorDeve = 0;
    }
    
    public float getValorDeve() {
        return valorDeve;
    }

    public void addValorDeve(float valorDeve) {
        this.valorDeve += valorDeve;
    }
    
    public void remValorDeve(float valor) {
        valorDeve = valorDeve - valor;
    }
    
    @Override
    public void criarCodigo(int codigo) {
        setCodigo(codigo + 50000);
    }
    
    @Override
    public void adicionarSaldo() {
        float saldo;
        
        saldo = valorDeve * -1;
        
        setSaldo(saldo);
    }
}
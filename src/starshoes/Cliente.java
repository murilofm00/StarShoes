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

    public float getValorDeve() {
        return valorDeve;
    }

    public void setValorDeve(float valorDeve) {
        this.valorDeve = valorDeve;
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
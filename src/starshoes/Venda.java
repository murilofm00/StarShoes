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
public class Venda {
    private String data;
    private float valorCompra;
    private float entrada;
    private float porcentDesc;
    private float desconto;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList <Tenis> compras;
    
    public Venda() {
        compras = new ArrayList<Tenis>();
        valorCompra = 0;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public void setValorCompra(float valorCompra, float porcentDesc) {
        this.desconto = (float) (valorCompra * (porcentDesc * 0.01));
        this.valorCompra = valorCompra - this.desconto;
    }
    
    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public float getPorcentDesconto() {
        return porcentDesc;
    }

    public void setPorcentDesconto(float porcentDesc) {
        this.porcentDesc = porcentDesc;
    }
    
    public float getDesconto() {
        return desconto;
    }
    
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
}

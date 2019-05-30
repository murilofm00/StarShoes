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
public class Venda {
    private String data;
    private float valorCompra;
    private float valorPago;
    private float desconto;
    private int quantidade;
    private int codigo;
    private Cliente cliente;
    private Vendedor vendedor;
    private Tenis tenis;
    
    public Venda() {
        tenis = new Tenis();
        valorCompra = 0;
        cliente = new Cliente();
        vendedor = new Vendedor();
        tenis = new Tenis();
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
    
    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
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

    public Tenis getTenis() {
        return tenis;
    }

    public void setTenis(Tenis tenis) {
        this.tenis = tenis;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calculaValorEmAberto() {
        return valorCompra - valorPago;
    }
    
    public void criarCodigo(int codigo) {
        setCodigo(codigo + 70000);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void pagarParcela(float parcela) {
        valorPago += parcela;
    }
}

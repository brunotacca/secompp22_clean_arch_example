package com.example.entities;

import java.math.BigDecimal;

class ItemDoCarrinhoImpl implements ItemDoCarrinho {

    private Produto produto;
    private Integer quantidade;
    private final Double desconto = 10.0;

    public ItemDoCarrinhoImpl(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public Produto getProduto() {
        return produto;
    }

    @Override
    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public BigDecimal calcularTotal() {
        BigDecimal totalDoItem = produto.calcularTotal().multiply(new BigDecimal(quantidade));

        // Produto com mais de 10 quantidades (10 produtos iguais) 
        // deve aplicar um desconto de 10% no valor total do mesmo produto
        if(quantidade > 10) {
            Double coeficienteDesconto = 1.0 - desconto/100.0;
            BigDecimal multiplicador = new BigDecimal(coeficienteDesconto);
            return totalDoItem.multiply(multiplicador);
        }

        return totalDoItem;
    }
    
}

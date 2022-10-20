package com.example.entities;

import java.math.BigDecimal;

public interface ItemDoCarrinho {
    
    public abstract Produto getProduto();
    public abstract Integer getQuantidade();

    public abstract BigDecimal calcularTotal();

}

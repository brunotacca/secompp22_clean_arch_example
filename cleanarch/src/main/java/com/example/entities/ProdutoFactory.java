package com.example.entities;

import java.math.BigDecimal;

public class ProdutoFactory {
    
    public Produto criaProduto(String nome, BigDecimal valorUnitario) {
        return new ProdutoImpl(nome, valorUnitario);
    }

}

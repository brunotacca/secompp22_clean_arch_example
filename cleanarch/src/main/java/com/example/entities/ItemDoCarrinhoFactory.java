package com.example.entities;

public class ItemDoCarrinhoFactory {
    
    public ItemDoCarrinho criarItem(Produto produto, Integer quantidade) {
        return new ItemDoCarrinhoImpl(produto, quantidade);
    }
}

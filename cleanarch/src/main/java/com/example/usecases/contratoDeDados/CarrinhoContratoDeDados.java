package com.example.usecases.contratoDeDados;

import com.example.entities.CarrinhoDeCompras;
import com.example.entities.ItemDoCarrinho;

public interface CarrinhoContratoDeDados {
    
    public abstract CarrinhoDeCompras adicionarItem(ItemDoCarrinho item);
}

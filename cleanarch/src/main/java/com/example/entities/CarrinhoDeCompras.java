package com.example.entities;

import java.math.BigDecimal;
import java.util.List;

public interface CarrinhoDeCompras {
    
    public abstract List<ItemDoCarrinho> getListaDeItens();

    public abstract BigDecimal calcularTotal();
    public abstract BigDecimal checkout();
}

package com.example.entities;

import java.math.BigDecimal;
import java.util.List;

public class CarrinhoDeComprasImpl implements CarrinhoDeCompras{

    private List<ItemDoCarrinho> itensDoCarrinho;
    private final Double desconto = 20.0;

    @Override
    public List<ItemDoCarrinho> getListaDeItens() {
        return itensDoCarrinho;
    }

    @Override
    public BigDecimal calcularTotal() {
        BigDecimal totalDoCarrinho = BigDecimal.ZERO;

        for(ItemDoCarrinho item : itensDoCarrinho) {
            totalDoCarrinho = totalDoCarrinho.add(item.calcularTotal());
        }

        // Compras com valor total acima de 5000 reais 
        // deve aplicar um desconto de 20% do valor;
        if(totalDoCarrinho.compareTo(new BigDecimal(5000.0))>0) {
            Double coeficienteDesconto = 1.0 - desconto/100.0;
            BigDecimal multiplicador = new BigDecimal(coeficienteDesconto);
            return totalDoCarrinho.multiply(multiplicador);
        }

        return totalDoCarrinho;
    }

    @Override
    public BigDecimal checkout() {
        // TODO Auto-generated method stub
        // ????????????/
        return null;
    }
}

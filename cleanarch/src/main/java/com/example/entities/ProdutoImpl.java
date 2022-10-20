package com.example.entities;

import java.math.BigDecimal;

public class ProdutoImpl implements Produto {

    private final String nome;
    private final BigDecimal valorUnitario;
    private final Double desconto = 10.0;


    public ProdutoImpl(String nome, BigDecimal valorUnitario) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public BigDecimal calcularTotal() {
        // Produto com valor unitário acima de 100 R$
        // deve ter um desconto de 10%
        if(valorUnitario.compareTo(new BigDecimal(100.0)) > 0) {
            Double coeficienteDesconto = 1.0 - desconto/100.0;
            BigDecimal multiplicador = new BigDecimal(coeficienteDesconto);
            return valorUnitario.multiply(multiplicador);
        }

        return valorUnitario;
    }

}
